package com.dsm.mx.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value = "/hellow")
  public   String helloIli(){

      return "Descansa por hoy Ili";

    }
}
