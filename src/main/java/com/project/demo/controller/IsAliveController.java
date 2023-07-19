package com.project.demo.controller;

import com.project.demo.hello.interfaces.IGreeter;
import org.joda.time.LocalTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IsAliveController {

    @Autowired
    IGreeter greeter;

    @GetMapping(path = "/isAlive",
    produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> call(){

        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time before execution is: " + currentTime);

        return new ResponseEntity<>("hello Anoop Eclipse says" + greeter.sayHello(), HttpStatus.OK);
    }

}
