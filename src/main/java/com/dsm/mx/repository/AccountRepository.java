package com.dsm.mx.repository;

import com.dsm.mx.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    //By extending the JpaRepository we have by default some methods to interact with the DB
}
