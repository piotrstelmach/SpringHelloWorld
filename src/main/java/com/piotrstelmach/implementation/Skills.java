package com.piotrstelmach.implementation;

import com.piotrstelmach.interfaces.MySkills;
import org.springframework.stereotype.Component;

@Component
public class Skills implements MySkills {

    private String skills;

    public Skills() {
        skills="Java, Python, Android, C#";
    }


    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String ShowMySkills() {
        return "my skills: "+skills;
    }
}
