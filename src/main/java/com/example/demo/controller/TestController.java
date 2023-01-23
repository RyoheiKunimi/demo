package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/getData")
    public ResponseEntity getData(){
        ResponseEntity responseEntity = new ResponseEntity<String>("Test", HttpStatusCode.valueOf(200));
        return responseEntity;
    }
}
