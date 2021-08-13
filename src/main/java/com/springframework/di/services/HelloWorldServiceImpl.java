package com.springframework.di.services;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldServiceImpl implements HelloWorldService{
    @Override
    public String getGreeting (){
        return "Hello World....!!!";
    }
}
