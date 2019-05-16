package com.piotrstelmach.implementation;

import com.piotrstelmach.interfaces.SayHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyHello implements SayHello {

    private String name;

    @Autowired
    private Skills skills;

    public MyHello(@Value("your guest!") String name) {
        this.name=name;
    }

    public String Hello() {
        return "Hello World! I'm Piotr Stelmach "+ skills.ShowMySkills();
    }

    public String HelloName() {
        return "Hello World! I'm "+name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
