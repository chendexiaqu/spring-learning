package com.github.chendexiaqu.boot.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HahaControllerTest {

    @Autowired
    private HahaController hahaController;

    @Test
    public void should() throws Exception {
        ResponseEntity responseEntity = hahaController.sayHahaToTheWord();
        assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);
    }
}