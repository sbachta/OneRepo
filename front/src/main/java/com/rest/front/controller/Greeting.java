package com.rest.front.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {

    @RequestMapping("/application/greeting")
    public String greeting(){
        return "This page was intentionally left blank.";
    }
}
