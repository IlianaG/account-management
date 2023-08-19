package com.dsm.mx.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldJavi {
    @GetMapping(value="/hi")
    public String HelloJavi(){
        return "Hola Javi";
    }
}
