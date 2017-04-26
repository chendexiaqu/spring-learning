package com.github.chendexiaqu.model;

public class AbcBean {
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "AbcBean{" +
                "info='" + info + '\'' +
                '}';
    }
}
