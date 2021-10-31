package com.ru.nc.edu.filonov.entities.contracts;

import com.ru.nc.edu.filonov.entities.person.Person;

import java.time.LocalDate;

/**
 * Класс, описывающий контракт на проводной интернет
 */
public class WiredInternetContract extends Contract {

    /** Скорость соединения */
    private int connectionSpeed;

    /**
     * Конструктор класса
     * @param id уникальный идентификатор
     * @param startDate дата начала
     * @param endDate дата окончания
     * @param number номер
     * @param owner владелец (объект класса Person)
     * @param connectionSpeed скорость соединения
     */
    public WiredInternetContract(Long id, LocalDate startDate, LocalDate endDate, int number, Person owner,
                                 int connectionSpeed) {
        super(id, startDate, endDate, number, owner);
        this.connectionSpeed = connectionSpeed;
    }

    /**
     * Getter скорости соединения
     * @return скорость соединения
     */
    public int getConnectionSpeed() {
        return connectionSpeed;
    }

    /**
     * Setter скорости соединения
     * @param connectionSpeed скорость соединения
     */
    public void setConnectionSpeed(int connectionSpeed) {
        this.connectionSpeed = connectionSpeed;
    }
}
