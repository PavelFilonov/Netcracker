package com.ru.nc.edu.filonov.entities.contracts;

import com.ru.nc.edu.filonov.entities.person.Person;

import java.time.LocalDate;
import java.util.UUID;

public class WiredInternetContract extends Contract {

    private int connectionSpeed;

    public WiredInternetContract(UUID id, LocalDate startDate, LocalDate endDate, int number, Person owner,
                                 int connectionSpeed) {
        super(id, startDate, endDate, number, owner);
        this.connectionSpeed = connectionSpeed;
    }

    public WiredInternetContract(LocalDate startDate, LocalDate endDate, int number, Person owner,
                                 int connectionSpeed) {
        super(UUID.randomUUID(), startDate, endDate, number, owner);
        this.connectionSpeed = connectionSpeed;
    }

    public int getConnectionSpeed() {
        return connectionSpeed;
    }

    public void setConnectionSpeed(int connectionSpeed) {
        this.connectionSpeed = connectionSpeed;
    }
}
