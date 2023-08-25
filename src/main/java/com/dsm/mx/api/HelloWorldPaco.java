package com.dsm.mx.api;

import com.dsm.mx.dto.AccountDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldPaco {

    @GetMapping(value = "/bonjour")
    public String helloPaco(){
        return "Buenas noches Paco";
    }

    // GET http://localhost:8080/home/accounts --all accounts from current user
    // c123, c456, c789
    // GET http://localhost:8080/home/accounts/c456/details --- access details for a specific account
    // GET http://localhost:8080/home/accounts?creditCards=true

    // GET http://localhost:8080/signup?name=Francisco&email=sdfsd@gmail.com&password=12345....
    // POST

    //PathParam o PathVariable
    @GetMapping(value = "/hola/{nombre}")
    public String helloPerson(@PathVariable("nombre") String name, @RequestParam("flag1") String flag1){
        return "Buenas noches--" + name + "   " + flag1;
    }

    //Request parameters after the ? symbol. Example ?name=paco&email=myemail&password=securepass
    @GetMapping(value = "/signup")
    public String signup(@RequestParam String name, @RequestParam String email, @RequestParam String password){
        System.out.println("name:" +  name +  " email:" + email + " password:" + password);
        return "Tu registro fue exitoso";
    }

    @PostMapping(value = "/accounts")
    public String newAccount(@RequestBody AccountDto accountDto){
        System.out.println("Se recibe: " + accountDto);
        return "Cuenta registrada";
    }


}
