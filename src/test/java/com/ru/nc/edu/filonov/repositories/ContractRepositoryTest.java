package com.ru.nc.edu.filonov.repositories;

import com.ru.nc.edu.filonov.entities.contracts.Contract;
import com.ru.nc.edu.filonov.entities.contracts.DigitalTvContract;
import com.ru.nc.edu.filonov.entities.person.Person;
import com.ru.nc.edu.filonov.enums.Sex;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

/**
 * Класс для тестирования методов класса ContractRepository
 */
public class ContractRepositoryTest {

    /**
     * Метод тестирования добавления контракта
     */
    @Test
    public void add() {
        ContractRepository repository = new ContractRepository();
        Assert.assertEquals(repository.getContracts().size(), 0);
        repository.add(new DigitalTvContract(
                1L, LocalDate.of(2020, 1, 1), LocalDate.of(2021, 1, 1), 10,
                new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29), Sex.MALE, 1111),
                new String[]{"1-ый канал", "2-йо канал"}));
        Assert.assertEquals(repository.getContracts().get(0).getId(), Long.valueOf(1));
        Assert.assertEquals(repository.getContracts().size(), 1);
    }

    /**
     * Метод тестирования добавления списка контрактов
     */
    @Test
    public void addAll() {
        ContractRepository repository = new ContractRepository();
        Assert.assertEquals(repository.getContracts().size(), 0);
        repository.add(new DigitalTvContract(
                1L, LocalDate.of(2020, 1, 1), LocalDate.of(2021, 1, 1), 10,
                new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29), Sex.MALE, 1111),
                new String[]{"1-ый канал", "2-йо канал"}));
        repository.add(new DigitalTvContract(
                2L, LocalDate.of(2020, 1, 1), LocalDate.of(2021, 1, 1), 10,
                new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29), Sex.MALE, 1111),
                new String[]{"1-ый канал", "2-йо канал"}));
        Assert.assertEquals(repository.getContracts().get(0).getId(), Long.valueOf(1));
        Assert.assertEquals(repository.getContracts().get(1).getId(), Long.valueOf(2));
        Assert.assertEquals(repository.getContracts().size(), 2);
    }

    /**
     * Метод тестирования удаления контракта по id
     */
    @Test
    public void removeById() {
        ContractRepository repository = new ContractRepository();
        Assert.assertEquals(repository.getContracts().size(), 0);
        repository.add(new DigitalTvContract(
                1L, LocalDate.of(2020, 1, 1), LocalDate.of(2021, 1, 1), 10,
                new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29), Sex.MALE, 1111),
                new String[]{"1-ый канал", "2-йо канал"}));
        Assert.assertEquals(repository.getContracts().size(), 1);
        repository.removeById(1L);
        Assert.assertEquals(repository.getContracts().size(), 0);
    }

    /**
     * Метод тестирования получения контракта
     */
    @Test
    public void get() {
        ContractRepository repository = new ContractRepository();
        Contract contract = new DigitalTvContract(
                1L, LocalDate.of(2020, 1, 1), LocalDate.of(2021, 1, 1), 10,
                new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29), Sex.MALE, 1111),
                new String[]{"1-ый канал", "2-йо канал"});
        repository.add(contract);
        Assert.assertEquals(repository.get(1L).get(), contract);
    }
}