package com.github.chendexiaqu.boot.controller;

import com.github.chendexiaqu.boot.service.HahaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/haha", method = RequestMethod.GET)
public class HahaController {

    private HahaService hahaService;

    @Autowired
    public HahaController(HahaService hahaService) {
        this.hahaService = hahaService;
    }

    @RequestMapping
    public ResponseEntity sayHahaToTheWord(){
        hahaService.doSomething();
        return ResponseEntity.ok("haha");
    }

}
