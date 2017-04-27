package com.github.chendexiaqu.configuration;

import com.github.chendexiaqu.model.HelloBean;
import com.github.chendexiaqu.model.NiceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.github.chendexiaqu.component")
public class AppConfiguration {

    @Bean
    public HelloBean helloBean(){
        return new HelloBean();
    }

    @Bean
    public NiceBean niceBean(HelloBean helloBean){
        return new NiceBean(helloBean);
    }

}
