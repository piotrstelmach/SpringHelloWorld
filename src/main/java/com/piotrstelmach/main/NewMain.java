package com.piotrstelmach.main;

import com.piotrstelmach.config.AutoConfig;

import com.piotrstelmach.implementation.MyHello;
import com.piotrstelmach.interfaces.SayHello;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NewMain {


    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AutoConfig.class);
        SayHello sayHello=context.getBean(MyHello.class);
        System.out.println(sayHello.Hello());
        System.out.println(sayHello.HelloName());

    }
}
