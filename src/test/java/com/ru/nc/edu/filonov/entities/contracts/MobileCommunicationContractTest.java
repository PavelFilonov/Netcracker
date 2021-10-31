package com.ru.nc.edu.filonov.entities.contracts;

import com.ru.nc.edu.filonov.entities.person.Person;
import com.ru.nc.edu.filonov.enums.Sex;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

/**
 * Класс для тестирования методов класса MobileCommunicationContract
 */
public class MobileCommunicationContractTest {

    /**
     * Метод тестирования получения количества минут
     */
    @Test
    public void testGetNumberOfMinutes() {
        MobileCommunicationContract contract = new MobileCommunicationContract(
                1L, LocalDate.of(2000, 1, 1), LocalDate.of(2021, 1, 1), 10,
                new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29), Sex.MALE, 1111),
                1000, 500, 100);
        Assert.assertEquals(contract.getNumberOfMinutes(), 1000);
    }

    /**
     * Метод тестирования изменения количества минут
     */
    @Test
    public void testSetNumberOfMinutes() {
        MobileCommunicationContract contract = new MobileCommunicationContract(
                1L, LocalDate.of(2020, 1, 1), LocalDate.of(2021, 1, 1), 10,
                new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29), Sex.MALE, 1111),
                1000, 500, 100);
        contract.setNumberOfMinutes(900);
        Assert.assertEquals(contract.getNumberOfMinutes(), 900);
    }

    /**
     * Метод тестирования получения количества смс
     */
    @Test
    public void testGetNumberOfSmsMessages() {
        MobileCommunicationContract contract = new MobileCommunicationContract(
                1L, LocalDate.of(2020, 1, 1), LocalDate.of(2021, 1, 1), 10,
                new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29), Sex.MALE, 1111),
                1000, 500, 100);
        Assert.assertEquals(contract.getNumberOfSmsMessages(), 500);
    }

    /**
     * Метод тестирования изменения количества смс
     */
    @Test
    public void testSetNumberOfSmsMessages() {
        MobileCommunicationContract contract = new MobileCommunicationContract(
                1L, LocalDate.of(2020, 1, 1), LocalDate.of(2021, 1, 1), 10,
                new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29), Sex.MALE, 1111),
                1000, 500, 100);
        contract.setNumberOfSmsMessages(400);
        Assert.assertEquals(contract.getNumberOfSmsMessages(), 400);
    }

    /**
     * Метод тестирования получения количества Гб траффика
     */
    @Test
    public void testGetNumberOfGbOfTraffic() {
        MobileCommunicationContract contract = new MobileCommunicationContract(
                1L, LocalDate.of(2000, 1, 1), LocalDate.of(2021, 1, 1), 10,
                new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29), Sex.MALE, 1111),
                1000, 500, 100);
        Assert.assertEquals(contract.getNumberOfGbOfTraffic(), 100);
    }

    /**
     * Метод тестирования изменения количества Гб траффика
     */
    @Test
    public void testSetNumberOfGbOfTraffic() {
        MobileCommunicationContract contract = new MobileCommunicationContract(
                1L, LocalDate.of(2020, 1, 1), LocalDate.of(2021, 1, 1), 10,
                new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29), Sex.MALE, 1111),
                1000, 500, 100);
        contract.setNumberOfGbOfTraffic(50);
        Assert.assertEquals(contract.getNumberOfGbOfTraffic(), 50);
    }
}
