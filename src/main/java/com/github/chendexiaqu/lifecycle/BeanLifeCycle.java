package com.github.chendexiaqu.lifecycle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeanLifeCycle {
    public static void lifeCycleInBeanFactory(String xmlPath, String beanId) {
//        Resource res = new ClassPathResource(xmlPath);
//        BeanFactory context = new XmlBeanFactory(res);

        AbstractApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);

//        context.refresh();

        //Register MyBeanPostProcessor

        context.getBeanFactory().addBeanPostProcessor(new MyBeanPostProcessor());
//        ((ConfigurableBeanFactory) context).addBeanPostProcessor(new MyBeanPostProcessor());
        //Register MyInstantiationAwareBeanPostProcessor

        context.getBeanFactory().addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());
//        ((ConfigurableBeanFactory) context).addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());

        //First time get car，Tell system to initialize Bean, lifecycle happens

        System.out.println("start to get bean");
        Car car1 = (Car) context.getBean(beanId);
        System.out.println(car1);
        car1.setColor("red");

        System.out.println("get car at second time");
        //Second time get car ，if singleton,call from cache.
        Car car2 = (Car) context.getBean(beanId);

        System.out.println("car1==car2：" + (car1 == car2));
        //close
//        ((XmlBeanFactory) context).destroySingletons();
        context.destroy();
    }

}


