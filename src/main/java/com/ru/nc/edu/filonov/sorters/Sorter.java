package com.ru.nc.edu.filonov.sorters;

import com.ru.nc.edu.filonov.utils.MyList;

import java.util.Comparator;

/**
 * Интерфейс для сортировки списка
 * @param <T> тип данных
 */
@FunctionalInterface
public interface Sorter <T> {

    /**
     * @param data список, который нужно отсортировать
     * @param comparator компаратор для сравнения объектов
     */
    void sort(MyList<T> data, Comparator<T> comparator);
}
