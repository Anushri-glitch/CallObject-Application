package com.Shrishti.CallObjectApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration // What ever objects will be created in this class that spring will call them we will not call them.
@ComponentScan(basePackages = {"ComponentScan"})
public class CustomConfiguration {

    @Bean("Anushka")
    @Lazy
    public Student getStudent1(){
        System.out.println("Spring call... in config bean of student");
        return new Student("Anushka");
    }

    @Bean("Shruti")
    public Student getStudent2(){
        System.out.println("Spring call... in config bean of student");
        return new Student("Shruti");
    }
}
