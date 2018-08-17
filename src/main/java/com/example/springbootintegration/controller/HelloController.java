package com.example.springbootintegration.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @ApiOperation(value = "/hello")
    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println(" == hello");
        return "hello";
    }
}
