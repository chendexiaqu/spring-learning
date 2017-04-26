package com.github.chendexiaqu.model;

public class HelloBean {
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "HelloBean{" +
                "info='" + info + '\'' +
                '}';
    }
}
