package com.Shrishti.CallObjectApplication.Controller;

import com.Shrishti.CallObjectApplication.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // It is used to tell our application that this is a controller class so when ever a
// API hits it first interact with the controller class.
public class StudentController {
    @Autowired
    @Qualifier("Shruti")
    Student s1;

    @GetMapping("/student")
    public Student getStudent(){
        return s1;
    }
}
