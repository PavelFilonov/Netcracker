package com.ru.nc.edu.filonov.entities.contracts;

import com.ru.nc.edu.filonov.entities.person.Person;
import com.ru.nc.edu.filonov.enums.Sex;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

/**
 * Класс для тестирования методов класса WiredInternetContract
 */
public class WiredInternetContractTest {

    /**
     * Метод тестирования получения скорости соединения
     */
    @Test
    public void testGetConnectionSpeed() {
        WiredInternetContract contract = new WiredInternetContract(
                1L, LocalDate.of(2000, 1, 1), LocalDate.of(2021, 1, 1), 10,
                new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29), Sex.MALE, 1111),
                100);
        Assert.assertEquals(contract.getConnectionSpeed(), 100);
    }

    /**
     * Метод тестирования изменения скорости соединения
     */
    @Test
    public void testSetConnectionSpeed() {
        WiredInternetContract contract = new WiredInternetContract(
                1L, LocalDate.of(2000, 1, 1), LocalDate.of(2021, 1, 1), 10,
                new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29), Sex.MALE, 1111),
                100);
        contract.setConnectionSpeed(50);
        Assert.assertEquals(contract.getConnectionSpeed(), 50);
    }
}
