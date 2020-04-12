package com.example.hello_world.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class TestControler {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }
}
