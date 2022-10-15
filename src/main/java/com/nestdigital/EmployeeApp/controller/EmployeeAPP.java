package com.nestdigital.EmployeeApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeAPP {
    @GetMapping("/")
    public String Homepage(){
        return "Welcome to home page";
    }
    @GetMapping("/emoloyeeadd")
    public String Employeeadd(){
        return "Employee add page";
    }
    @GetMapping("/employeesearch")
    public String Employeesearch(){
        return  "Employee search page";
    }
    @GetMapping("/employeedelete")
    public String Employeedelete(){
        return "Employee delete page";
    }
}
