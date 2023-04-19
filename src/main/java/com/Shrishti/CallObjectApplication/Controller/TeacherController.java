package com.Shrishti.CallObjectApplication.Controller;

import ComponentScan.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {
    @Autowired
    Teacher t1; // with the help of Autowired object is automatically created for t1...........whenever it comes in use.

    @RequestMapping(value = "/teach" , method = RequestMethod.GET)
    public String teach(){
        return t1.teach();
    }
}