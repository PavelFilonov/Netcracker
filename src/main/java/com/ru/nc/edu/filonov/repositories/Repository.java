package com.ru.nc.edu.filonov.repositories;

import com.ru.nc.edu.filonov.utils.MyList;

import java.util.Optional;

/**
 * Интерфейс репозитория
 * @param <T> тип данных
 */
public interface Repository<T> {

    /**
     * Метод добавления контракта
     * @param item объект класса контракта, который нужно добавить
     * @return результат добавления (true - добавлен, false - не добавлен)
     */
    boolean add(T item);

    /**
     * Метод для добавления списка контрактов
     * @param items список контрактов
     */
    void addAll(MyList<T> items);

    /**
     * Метод удаления контракта по id
     * @param id уникальный идентификатор удаляемого контракта
     * @return результат удаления (true - удалён, false - не удалён)
     */
    boolean removeById(Long id);

    /**
     * Метод получения контракта по id
     * @param id уникальный идентификатор получаемого контракта
     * @return контракт, обёрнутый в Optional
     */
    Optional<T> get(Long id);
}
