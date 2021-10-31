package com.ru.nc.edu.filonov.entities.contracts;

import com.ru.nc.edu.filonov.entities.person.Person;

import java.time.LocalDate;

/**
 * Класс, описывающий контракт на цифровое телевидение
 */
public class DigitalTvContract extends Contract {

    /** Пакет каналов */
    private String[] channelPackage;

    /**
     * Конструктор класса
     * @param id уникальный идентификатор
     * @param startDate дата начала
     * @param endDate дата окончания
     * @param number номер
     * @param owner владелец (объект класса Person)
     * @param channelPackage пакет каналов
     */
    public DigitalTvContract(Long id, LocalDate startDate, LocalDate endDate, int number, Person owner, String[] channelPackage) {
        super(id, startDate, endDate, number, owner);
        this.channelPackage = channelPackage;
    }

    /**
     * Getter пакета каналов
     * @return пакет каналов
     */
    public String[] getChannelPackage() {
        return channelPackage;
    }

    /**
     * Setter пакета каналов
     * @param channelPackage пакет каналов
     */
    public void setChannelPackage(String[] channelPackage) {
        this.channelPackage = channelPackage;
    }
}
