package com.ru.nc.edu.filonov.entities.contracts;

import com.ru.nc.edu.filonov.entities.person.Person;
import com.ru.nc.edu.filonov.enums.Sex;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

/**
 * Класс для тестирования методов класса DigitalTvContract
 */
public class DigitalTvContractTest {

    /**
     * Метод тестирования получения пакета каналов
     */
    @Test
    public void testGetChannelPackage() {
        DigitalTvContract contract = new DigitalTvContract(
                1L, LocalDate.of(2020, 1, 1), LocalDate.of(2021, 1, 1), 10,
                new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29), Sex.MALE, 1111),
                new String[]{"1-ый канал", "2-йо канал"});
        Assert.assertEquals(contract.getChannelPackage(), new String[]{"1-ый канал", "2-йо канал"});
    }

    /**
     * Метод тестирования изменения пакета каналов
     */
    @Test
    public void testSetChannelPackage() {
        DigitalTvContract contract = new DigitalTvContract(
                1L, LocalDate.of(2020, 1, 1), LocalDate.of(2021, 1, 1), 10,
                new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29), Sex.MALE, 1111),
                new String[]{"1-ый канал", "2-йо канал"});
        contract.setChannelPackage(new String[]{"1-ый канал", "2-йо канал", "3-ий канал"});
        Assert.assertEquals(contract.getChannelPackage(), new String[]{"1-ый канал", "2-йо канал", "3-ий канал"});
    }
}
