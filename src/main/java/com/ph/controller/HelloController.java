package com.ph.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-helloworld
 * @description:
 * @author: panhao
 * @date: 2021-06-25 20:52
 **/
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello Spring Boot!";
    }
}
