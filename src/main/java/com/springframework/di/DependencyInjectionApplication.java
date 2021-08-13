package com.springframework.di;

import com.springframework.di.controller.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
        GreetingController controller = (GreetingController) ctx.getBean("greetingController") ;
        controller.sayHello();
    }

}
