package com.github.chendexiaqu.app;

import com.github.chendexiaqu.common.AppConfiguration;
import com.github.chendexiaqu.model.HelloBean;
import com.github.chendexiaqu.model.NiceBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App {
    public static void main(String[] args) {
//        workWithFileApplicationContext();
        workWithClassPathApplicationContext();
//        postWithBeanFactory();
//        postWithJavaConfigContext();
    }

    private static void workWithClassPathApplicationContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloBean helloBean = (HelloBean) context.getBean("helloBean");
        System.out.println(helloBean);
    }

    private static void workWithFileApplicationContext() {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:beans.xml");
        HelloBean helloBean = (HelloBean) context.getBean("helloBean");
        NiceBean niceBean = (NiceBean) context.getBean("niceBean");
        Object abcBean = context.getBean("abcBean");
        System.out.println(abcBean);
    }

    public static void postWithBeanFactory() {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//        beanFactory = new ClassPathXmlApplicationContext("beans.xml");
        Object helloBean = beanFactory.getBean("helloBean");
        System.out.println(helloBean);
    }

    public static void postWithJavaConfigContext() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        Object niceBean = applicationContext.getBean("niceBean");
        System.out.println(niceBean);
    }


}