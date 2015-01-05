package org.sevenasix.medium.actors;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

public class Student {

    private final String name;


    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}
