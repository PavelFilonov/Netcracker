package com.ru.nc.edu.filonov.sorters;

import com.ru.nc.edu.filonov.utils.MyList;

import java.util.Comparator;

/**
 * Реализация сортировки списка методом пузырька
 */
public class BubbleSorter<T> implements Sorter<T> {

    /**
     * @param data       список, который нужно отсортировать
     * @param comparator компаратор для сравнения объектов
     */
    @Override
    public void sort(MyList<T> data, Comparator<T> comparator) {
        for (int i = data.size() - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if(comparator.compare(data.get(j), data.get(j + 1)) > 0)
                    toSwap(data, j, j + 1);
            }
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
