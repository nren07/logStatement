package com.logstatement.logstatement;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController  // this annotation tells the compilar that all the api is called from here 
@Slf4j  //this annnotation is used for logs
public class Controller {

    @GetMapping("/testLog")
    public void logStatement(){
        // log statement is used for print statement at time of run


        log.trace("This is error log");
        log.debug("I am debug log");
        log.info("I am  info log");
        log.warn("I am warning log ");
        log.error("I am error log ");
        System.out.println("hello world");
    }

    @GetMapping("/getApi")
    ResponseEntity<String> function(){
        // return an object of response entity
        return new ResponseEntity<>("This is a String body message",HttpStatus.BAD_GATEWAY);
    }
}
