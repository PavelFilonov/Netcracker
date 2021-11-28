package com.ru.nc.edu.filonov.repositories;

import com.ru.nc.edu.filonov.utils.MyList;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Интерфейс репозитория
 * @param <T> тип данных
 */
public interface Repository<T> {

    /**
     * Метод добавления объекта
     * @param item добавляемый объект
     * @return результат добавления (true - добавлен, false - не добавлен)
     */
    boolean add(T item);

    /**
     * Метод для добавления списка объектов
     * @param items список, который нужно добавить
     */
    void addAll(MyList<T> items);

    /**
     * Метод удаления объекта по id
     * @param id уникальный идентификатор удаляемого объекта
     * @return результат удаления (true - удалён, false - не удалён)
     */
    boolean removeById(Long id);

    /**
     * Метод получения объекта по id
     * @param id уникальный идентификатор получаемого объекта
     * @return объект, обёрнутый в Optional
     */
    Optional<T> get(Long id);


    /**
     * @param predicate предикат, по которому выбираются объекты
     * @return новый репозиторий из удовлятворяющих предикату объектов
     */
    Repository<T> search(Predicate<T> predicate);

    /**
     * Getter списка объектов
     * @return список объектов
     */
    MyList<T> getContracts();

    /**
     * @param index индекс получаемого объекта
     * @return объект
     */
    T getByIndex(int index);

    /**
     * Метод сортировки списка объектов репозитория
     */
    void sort(Comparator<T> comparator);
}
