package com.github.chendexiaqu.factory;

import com.github.chendexiaqu.model.AbcBean;

public class AbcBeanFactory {
    public static AbcBean getInstance(){
        AbcBean abcBean = new AbcBean();
        abcBean.setInfo("haha");
        return abcBean;
    }
}
