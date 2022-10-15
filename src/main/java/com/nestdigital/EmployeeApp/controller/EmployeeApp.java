package com.nestdigital.EmployeeApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeApp {
    @GetMapping("/")
    public String Homepage(){
        return "Welcome to my home page";
    }
    @GetMapping("/add")
    public String Add(){
        return "welcome to add page";
    }
    @GetMapping("/search")
    public String Search(){
        return "welcome to search page";
    }
    @GetMapping("/delete")
    public String Delete(){
        return "welcome to delete page";
    }

}
