package com.nest.employeeApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee {

    @GetMapping("")
    public String Homepage() {
        return "Homepage";
    }
    @GetMapping("/add")
    public String empAdd() {
        return "this is add page";
    }
    @GetMapping("/search")
    public String empsearch()
    {
        return "this is search page";
    }
    @GetMapping("/delete")
    public String empdelete()
    {
        return "this is delete page";

    }
}

