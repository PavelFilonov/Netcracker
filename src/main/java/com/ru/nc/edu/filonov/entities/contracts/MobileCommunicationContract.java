package com.ru.nc.edu.filonov.entities.contracts;

import com.ru.nc.edu.filonov.entities.person.Person;

import java.time.LocalDate;

public class MobileCommunicationContract extends Contract {

    private int numberOfMinutes;
    private int numberOfSmsMessages;
    private int numberOfGbOfTraffic;

    public MobileCommunicationContract(Long id, LocalDate startDate, LocalDate endDate, int number, Person owner,
                                       int numberOfMinutes, int numberOfSmsMessages, int numberOfGbOfTraffic) {
        super(id, startDate, endDate, number, owner);
        this.numberOfMinutes = numberOfMinutes;
        this.numberOfSmsMessages = numberOfSmsMessages;
        this.numberOfGbOfTraffic = numberOfGbOfTraffic;
    }

    public int getNumberOfMinutes() {
        return numberOfMinutes;
    }

    public void setNumberOfMinutes(int numberOfMinutes) {
        this.numberOfMinutes = numberOfMinutes;
    }

    public int getNumberOfSmsMessages() {
        return numberOfSmsMessages;
    }

    public void setNumberOfSmsMessages(int numberOfSmsMessages) {
        this.numberOfSmsMessages = numberOfSmsMessages;
    }

    public int getNumberOfGbOfTraffic() {
        return numberOfGbOfTraffic;
    }

    public void setNumberOfGbOfTraffic(int numberOfGbOfTraffic) {
        this.numberOfGbOfTraffic = numberOfGbOfTraffic;
    }
}
