package com.dsm.mx.controller;

import com.dsm.mx.dto.AccountDto;
import com.dsm.mx.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping("/account")
    String newAccount(@RequestBody AccountDto cuenta){
        System.out.println("Trying to store the account " + cuenta);

        return accountService.createAccount(cuenta);
    }

}
