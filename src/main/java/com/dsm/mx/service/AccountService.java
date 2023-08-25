package com.dsm.mx.service;

import com.dsm.mx.dto.AccountDto;

public interface AccountService {
    //In an interface we define the methods without the implementation
    //Car Interface: A car has engine, wheel drive, 4 wheels, 4 doors, can take you where you want
    //A Car can: Start/stop the engine, loadFuel, drive
    //An ElectricCar: el carro electrico necesita conectarse a la luz para "cargar combustible"
    //An GasolineCar: el carro de gasolina necesita ir a la gasolineria

    //In an interface we DEFINE what a class CAN DO, but it does not define how to do it

    String createAccount(AccountDto cuenta);




}
