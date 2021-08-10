package com.fastcampus.javaallinone.project3.mycontact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController // @Controller + @ResponseBody
public class HelloWorldController {

    @GetMapping("/api/helloWorld")
    public String helloWorld() {
        return "HelloWorld";
    }
}
