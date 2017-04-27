package com.github.chendexiaqu.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Car implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean, ApplicationContextAware {

    private String brand;
    private String color;
    private int maxSpeed;

    private BeanFactory beanFactory;
    private String beanName;

    public Car() {
        System.out.println("call the constructor");
    }

    public void setBrand(String brand) {
        this.brand = brand;
        System.out.println("call setter to set brand");
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    /**
     * BeanFactoryAware
     */
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Call BeanFactoryAware.setBeanFactory()");
        this.beanFactory = beanFactory;
    }

    /**
     * BeanNameAware
     */
    @Override
    public void setBeanName(String name) {
        System.out.println("Call BeanNameAware.setBeanName()");
        this.beanName = name;
    }

    /**
     * DisposableBean
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("Call DisposableBean.destroy()");
    }

    /**
     * InitializingBean
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Call InitializingBean.afterPropertiesSet()");
    }

    /**
     * ApplicationContextAware
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("call ApplicationContextAware.setApplicationContext()");
    }

    /**
     * init-method
     */
    public void myInit() {
        System.out.println("call init-method myInit()，set maxSpeed to 240");
        this.maxSpeed = 240;
    }

    /**
     * destroy-method
     */
    public void myDestroy() {
        System.out.println("call destroy-method myDestroy()");
    }

    //--------------getter and setter--------------------------------

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
