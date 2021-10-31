package com.ru.nc.edu.filonov.entities.contracts;

import com.ru.nc.edu.filonov.entities.person.Person;

import java.time.LocalDate;

/**
 * Класс, описывающий контракт на мобильную связь
 */
public class MobileCommunicationContract extends Contract {

    /** количество минут */
    private int numberOfMinutes;

    /** количество смс */
    private int numberOfSmsMessages;

    /** количество Гб трафика */
    private int numberOfGbOfTraffic;

    /**
     * Конструктор класса
     * @param id уникальный идентификатор
     * @param startDate дата начала
     * @param endDate дата окончания
     * @param number номер
     * @param owner владелец (объект класса Person)
     * @param numberOfMinutes количество минут
     * @param numberOfSmsMessages количество смс
     * @param numberOfGbOfTraffic количество Гб траффика
     */
    public MobileCommunicationContract(Long id, LocalDate startDate, LocalDate endDate, int number, Person owner,
                                       int numberOfMinutes, int numberOfSmsMessages, int numberOfGbOfTraffic) {
        super(id, startDate, endDate, number, owner);
        this.numberOfMinutes = numberOfMinutes;
        this.numberOfSmsMessages = numberOfSmsMessages;
        this.numberOfGbOfTraffic = numberOfGbOfTraffic;
    }

    /**
     * Getter количества минут
     * @return количетсво минут
     */
    public int getNumberOfMinutes() {
        return numberOfMinutes;
    }

    /**
     * Setter количества минут
     * @param numberOfMinutes количество минут
     */
    public void setNumberOfMinutes(int numberOfMinutes) {
        this.numberOfMinutes = numberOfMinutes;
    }

    /**
     * Getter количества смс
     * @return количество смс
     */
    public int getNumberOfSmsMessages() {
        return numberOfSmsMessages;
    }

    /**
     * Setter количества смс
     * @param numberOfSmsMessages количество смс
     */
    public void setNumberOfSmsMessages(int numberOfSmsMessages) {
        this.numberOfSmsMessages = numberOfSmsMessages;
    }

    /**
     * Getter количества Гб траффика
     * @return количество Гб траффика
     */
    public int getNumberOfGbOfTraffic() {
        return numberOfGbOfTraffic;
    }

    /**
     * Setter количества Гб траффика
     * @param numberOfGbOfTraffic количество Гб траффика
     */
    public void setNumberOfGbOfTraffic(int numberOfGbOfTraffic) {
        this.numberOfGbOfTraffic = numberOfGbOfTraffic;
    }
}
