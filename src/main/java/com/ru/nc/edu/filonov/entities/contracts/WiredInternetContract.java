package com.ru.nc.edu.filonov.entities.contracts;

import com.ru.nc.edu.filonov.entities.person.Person;

import java.time.LocalDate;

public class WiredInternetContract extends Contract {

    private int connectionSpeed;

    public WiredInternetContract(Long id, LocalDate startDate, LocalDate endDate, int number, Person owner,
                                 int connectionSpeed) {
        super(id, startDate, endDate, number, owner);
        this.connectionSpeed = connectionSpeed;
    }

    public int getConnectionSpeed() {
        return connectionSpeed;
    }

    public void setConnectionSpeed(int connectionSpeed) {
        this.connectionSpeed = connectionSpeed;
    }
}
