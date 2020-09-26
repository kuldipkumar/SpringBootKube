package com.fam.aahana.krish.SpringBootKube.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SimpleController {

    @GetMapping("/welcome")
    public String welcome(){
       return "Welcome to Family's simple controller";
    }
}
