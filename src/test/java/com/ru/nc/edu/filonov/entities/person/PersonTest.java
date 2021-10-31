package com.ru.nc.edu.filonov.entities.person;

import com.ru.nc.edu.filonov.enums.Sex;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

/**
 * Класс для тестирования методов класса Person
 */
public class PersonTest {

    /**
     * Метод тестирования получения уникального идентификатора
     */
    @Test
    public void testGetId() {
        Person person = new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29),
                Sex.MALE, 1111);
        Assert.assertEquals(person.getId(), Long.valueOf(2));
    }

    /**
     * Метод тестирования получения ФИО
     */
    @Test
    public void testGetFullName() {
        Person person = new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29),
                Sex.MALE, 1111);
        Assert.assertEquals(person.getFullName(), "Филонов Павел Олегович");
    }

    /**
     * Метод тестирования получения даты рождения
     */
    @Test
    public void testGetBirthday() {
        Person person = new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29),
                Sex.MALE, 1111);
        Assert.assertEquals(person.getBirthday(), LocalDate.of(2001, 7, 29));
    }

    /**
     * Метод тестирования получения пола
     */
    @Test
    public void testGetSex() {
        Person person = new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29),
                Sex.MALE, 1111);
        Assert.assertEquals(person.getSex(), Sex.MALE);
    }

    /**
     * Метод тестирования получения серии и номера паспорта
     */
    @Test
    public void testGetPassportSeriesAndNumber() {
        Person person = new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29),
                Sex.MALE, 1111);
        Assert.assertEquals(person.getPassportSeriesAndNumber(), 1111);
    }

    /**
     * Метод тестирования изменения ФИО
     */
    @Test
    public void testSetFullName() {
        Person person = new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29),
                Sex.MALE, 1111);
        person.setFullName("Филонов П. О.");
        Assert.assertEquals(person.getFullName(), "Филонов П. О.");
    }

    /**
     * Метод тестирования изменения даты рождения
     */
    @Test
    public void testSetBirthday() {
        Person person = new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29),
                Sex.MALE, 1111);
        person.setBirthday(LocalDate.of(2001, 7, 12));
        Assert.assertEquals(person.getBirthday(), LocalDate.of(2001, 7, 12));
    }

    /**
     * Метод тестирования изменения пола
     */
    @Test
    public void testSetSex() {
        Person person = new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29),
                Sex.MALE, 1111);
        person.setSex(Sex.FEMALE);
        Assert.assertEquals(person.getSex(), Sex.FEMALE);
    }

    /**
     * Метод тестирования изменения серии и номера паспорта
     */
    @Test
    public void testSetPassportSeriesAndNumber() {
        Person person = new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29),
                Sex.MALE, 1111);
        person.setPassportSeriesAndNumber(2222);
        Assert.assertEquals(person.getPassportSeriesAndNumber(), 2222);
    }

    /**
     * Метод тестирования получения возраста
     */
    @Test
    public void testGetAge() {
        Person person = new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29),
                Sex.MALE, 1111);
        Assert.assertEquals(person.getAge(), 20);
    }
}
