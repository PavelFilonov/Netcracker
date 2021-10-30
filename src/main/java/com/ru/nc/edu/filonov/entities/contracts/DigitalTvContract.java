package com.ru.nc.edu.filonov.entities.contracts;

import com.ru.nc.edu.filonov.entities.person.Person;

import java.time.LocalDate;
import java.util.UUID;

public class DigitalTvContract extends Contract {

    private String[] channelPackage;

    public DigitalTvContract(UUID id, LocalDate startDate, LocalDate endDate, int number, Person owner) {
        super(id, startDate, endDate, number, owner);
    }

    public DigitalTvContract(LocalDate startDate, LocalDate endDate, int number, Person owner) {
        super(UUID.randomUUID(), startDate, endDate, number, owner);
    }

    public String[] getChannelPackage() {
        return channelPackage;
    }

    public void setChannelPackage(String[] channelPackage) {
        this.channelPackage = channelPackage;
    }
}
