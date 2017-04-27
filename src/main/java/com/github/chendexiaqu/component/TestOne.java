package com.github.chendexiaqu.component;

import org.springframework.stereotype.Component;

@Component
public class TestOne {
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "TestOne{" +
                "info='" + info + '\'' +
                '}';
    }
}
