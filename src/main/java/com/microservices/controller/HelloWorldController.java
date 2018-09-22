package com.microservices.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/sayHello")
    public ResponseEntity sayHello(@RequestParam String name){
        System.out.println("Inside sayHello method");
        return new ResponseEntity("Hi "+ name +", Welcome to the world of Microservices." , HttpStatus.OK);
    }
}
