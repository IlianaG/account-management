package com.dsm.mx.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldPaco {

    @GetMapping(value = "/bonjour")
    public String helloPaco(){
        return "Buenas noches Paco";
    }
}
