package com.github.chendexiaqu.model;

public class NiceBean {

    private HelloBean helloBean;

    public NiceBean(HelloBean helloBean) {
        this.helloBean = helloBean;
    }



    public HelloBean getHelloBean() {
        return helloBean;
    }

    public void setHelloBean(HelloBean helloBean) {
        this.helloBean = helloBean;
    }

    @Override
    public String toString() {
        return "NiceBean{" +
                "helloBean=" + helloBean +
                '}';
    }
}
