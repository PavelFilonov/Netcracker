package com.ru.nc.edu.filonov.repositories;

import com.ru.nc.edu.filonov.entities.contracts.Contract;
import com.ru.nc.edu.filonov.entities.contracts.DigitalTvContract;
import com.ru.nc.edu.filonov.entities.person.Person;
import com.ru.nc.edu.filonov.enums.Sex;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Comparator;

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

    /**
     * Метод тестирования получения нового репозитория, у которого контракты удовлетворяет передаваемому предикату
     */
    @Test
    public void search() {
        Repository<Contract> originalRepository = new ContractRepository();

        Contract contract1 = new DigitalTvContract(
                1L, LocalDate.of(2020, 1, 1), LocalDate.of(2021, 1, 1), 10,
                new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29), Sex.MALE, 1111),
                new String[]{"1-ый канал", "2-йо канал"});
        originalRepository.add(contract1);

        Contract contract2 = new DigitalTvContract(
                2L, LocalDate.of(2020, 1, 1), LocalDate.of(2021, 1, 1), 10,
                new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29), Sex.MALE, 1111),
                new String[]{"1-ый канал", "2-йо канал"});
        originalRepository.add(contract2);

        Assert.assertEquals(originalRepository.getContracts().size(), 2);

        Repository<Contract> predicatedRepository1 = originalRepository.search(x -> x.getId() == 1L);
        Assert.assertEquals(predicatedRepository1.getContracts().size(), 1);
        Assert.assertEquals(predicatedRepository1.getByIndex(0).getId(), Long.valueOf(1));

        Repository<Contract> predicatedRepository2 = originalRepository.search(x -> x.getId() == 2L);
        Assert.assertEquals(predicatedRepository2.getContracts().size(), 1);
        Assert.assertEquals(predicatedRepository2.getByIndex(0).getId(), Long.valueOf(2));
    }

    /**
     * Метод тестирования сортировки по переданному компаратору
     */
    @Test
    public void sort() {
        Repository<Contract> repository = new ContractRepository();

        Contract contract1 = new DigitalTvContract(
                2L, LocalDate.of(2020, 1, 1), LocalDate.of(2021, 1, 1), 10,
                new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29), Sex.MALE, 1111),
                new String[]{"1-ый канал", "2-йо канал"});
        repository.add(contract1);

        Contract contract2 = new DigitalTvContract(
                1L, LocalDate.of(2020, 1, 1), LocalDate.of(2021, 1, 1), 10,
                new Person(2L, "Филонов Павел Олегович", LocalDate.of(2001, 7, 29), Sex.MALE, 1111),
                new String[]{"1-ый канал", "2-йо канал"});
        repository.add(contract2);

        Comparator<Contract> comparator = Comparator.comparing(Contract::getId);

        repository.sort(comparator);

        Assert.assertEquals(repository.getByIndex(0).getId(), Long.valueOf(1));
        Assert.assertEquals(repository.getByIndex(1).getId(), Long.valueOf(2));
    }
}