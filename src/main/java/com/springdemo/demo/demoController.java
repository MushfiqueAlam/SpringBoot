package com.springdemo.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {
    @RequestMapping("/path")
    public String helloWorld(){
        return "Hi I am port 8080";
    }
}
