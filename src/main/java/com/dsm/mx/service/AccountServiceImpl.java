package com.dsm.mx.service;

import com.dsm.mx.dto.AccountDto;
import com.dsm.mx.entities.Account;
import com.dsm.mx.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    AccountRepository accountRepository;

    @Override
    public String createAccount(AccountDto cuenta) {
        //Add business validation or business logic
        if(cuenta == null){
            throw new IllegalArgumentException("la cuenta es null");
        }

        //if the business logic is OK, we are going to store the cuenta
        //We are going to store the Account entity
        Account accountForDB = new Account();
        accountForDB.setAccountName(cuenta.getAccountName());
        accountForDB.setBalance(cuenta.getBalance());
        accountForDB.setAccountType(cuenta.getAccountType());
        accountForDB.setCreatedAt(LocalDateTime.now());

        accountRepository.save(accountForDB);

        return "OK with Id " + accountForDB.getAccountId();
    }
}
