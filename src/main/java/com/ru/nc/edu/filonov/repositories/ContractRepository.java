package com.ru.nc.edu.filonov.repositories;

import com.ru.nc.edu.filonov.entities.contracts.Contract;
import com.ru.nc.edu.filonov.sorters.BubbleSorter;
import com.ru.nc.edu.filonov.sorters.Sorter;
import com.ru.nc.edu.filonov.utils.MyArrayList;
import com.ru.nc.edu.filonov.utils.MyList;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Класс репозитория контрактов
 */
public class ContractRepository implements Repository<Contract> {

    /** Список контрактов */
    private MyList<Contract> contracts = new MyArrayList<>();

    private Sorter<Contract> sorter = new BubbleSorter<>();

    /**
     * Метод добавления контракта
     * @param item объект класса контракта, который нужно добавить
     * @return результат добавления (true - добавлен, false - не добавлен)
     */
    @Override
    public boolean add(Contract item) {
        if (contains(item))
            return false;

        contracts.add(item);
        return true;
    }

    /**
     * Метод для добавления списка контрактов
     * @param items список контрактов
     */
    @Override
    public void addAll(MyList<Contract> items) {
        contracts.addAll(items);
    }

    /**
     * Метод удаления контракта по id
     * @param id уникальный идентификатор удаляемого контракта
     * @return результат удаления (true - удалён, false - не удалён)
     */
    @Override
    public boolean removeById(Long id) {
        Optional<Contract> item = get(id);

        if (item.isPresent()) {
            contracts.remove(item.get());
            return true;
        }

        return false;
    }

    /**
     * Метод получения контракта по id
     * @param id уникальный идентификатор получаемого контракта
     * @return контракт, обёрнутый в Optional
     */
    @Override
    public Optional<Contract> get(Long id) {
        for (int i = 0; i < contracts.size(); i++) {
            if (contracts.get(i).getId().equals(id))
                return Optional.of(contracts.get(i));
        }

        return Optional.empty();
    }

    /**
     * @param predicate предикат, по которому выбираются контракты
     * @return новый репозиторий из удовлятворяющих предикату контрактов
     */
    @Override
    public Repository<Contract> search(Predicate<Contract> predicate) {
        Repository<Contract> newRepository = new ContractRepository();

        for (int i = 0; i < contracts.size(); i++) {
            if (predicate.test(contracts.get(i)))
                newRepository.add(contracts.get(i));
        }

        return newRepository;
    }


    /**
     * @param index индекс получаемого контракта
     * @return контракт
     */
    public Contract getByIndex(int index) {
        if (index >= 0 && index < contracts.size())
            return contracts.get(index);

        return null;
    }

    /**
     * Метод сортировки списка контрактов репозитория
     */
    @Override
    public void sort(Comparator<Contract> comparator) {
        sorter.sort(contracts, comparator);
    }

    /**
     * Метод, проверяющий входит ли контракт в список контрактов
     * @param item проверяемый контракт
     * @return результат проверки (true - входит, false - не входит)
     */
    private boolean contains(Contract item) {
        return contracts.contains(item);
    }

    /**
     * Getter списка контрактов
     * @return список контрактов
     */
    public MyList<Contract> getContracts() {
        return contracts; // не копия, потому что мой список не реализует интерфейс Collection
    }
}
