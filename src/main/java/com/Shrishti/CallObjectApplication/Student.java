package com.Shrishti.CallObjectApplication;

public class Student {
    private String name;

    //Getter
    public String getName() {
        return name;
    }
    //Setter
    public void setName(String name) {
        this.name = name;
    }
    //Non-Parameterised Constructor
    public Student() {
        System.out.println("Student called from spring framework-1");
    }

    //Parameterised Constructor
    public Student(String name) {
        this.name = name;
        System.out.println("Student called from spring framework-2 :" + this.name);

    }
}
