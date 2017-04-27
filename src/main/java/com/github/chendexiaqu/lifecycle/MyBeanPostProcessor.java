package com.github.chendexiaqu.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("myCar")) {
            Car car = (Car) bean;
            if (car.getColor() == null) {
                System.out.println("call BeanPostProcessor.postProcessBeforeInitialization()，color is null，set to black");
                car.setColor("black");
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("myCar")) {
            Car car = (Car) bean;
            if (car.getMaxSpeed() >= 200) {
                System.out.println("call BeanPostProcessor.postProcessAfterInitialization()，set maxSpeed to 200 if it's bigger than 200");
                car.setMaxSpeed(200);
            }
        }
        return bean;
    }
}
