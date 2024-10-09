package com.rest.crud_api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {

    @GetMapping("/")
    public String getPage(){
        return "welcome";
    }
}
