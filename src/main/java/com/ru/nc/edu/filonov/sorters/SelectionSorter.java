package com.ru.nc.edu.filonov.sorters;

import com.ru.nc.edu.filonov.utils.MyList;

import java.util.Comparator;

/**
 * Реализация сортировки списка методом выбора
 */
public class SelectionSorter<T> implements Sorter<T> {

    /**
     * @param data       список, который нужно отсортировать
     * @param comparator компаратор для сравнения объектов
     */
    @Override
    public void sort(MyList<T> data, Comparator<T> comparator) {
        for (int i = 0; i < data.size(); i++) {
            int min = i;

            for (int j = i; j < data.size(); j++) {
                if (comparator.compare(data.get(min), data.get(j)) > 0)
                    min = j;
            }

            toSwap(data, i, min);
        }
    }

    /**
     * Метод для замены двух объектов массива
     * @param data список
     * @param first индекс первого объекта
     * @param second индекс второго объекта
     */
    private void toSwap(MyList<T> data, int first, int second) {
        Object temp = data.get(first);
        data.replace(first, data.get(second));
        data.replace(second, temp);
    }
}
