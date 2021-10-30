package com.ru.nc.edu.filonov.entities.contracts;

import com.ru.nc.edu.filonov.entities.person.Person;

import java.time.LocalDate;

public class DigitalTvContract extends Contract {

    private String[] channelPackage;

    public DigitalTvContract(Long id, LocalDate startDate, LocalDate endDate, int number, Person owner) {
        super(id, startDate, endDate, number, owner);
    }

    public String[] getChannelPackage() {
        return channelPackage;
    }

    public void setChannelPackage(String[] channelPackage) {
        this.channelPackage = channelPackage;
    }
}
