package com.ru.nc.edu.filonov.sorters;

import com.ru.nc.edu.filonov.utils.MyArrayList;
import com.ru.nc.edu.filonov.utils.MyList;
import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

/**
 * Класс тестирования сортировки выбора
 */
public class SelectionSorterTest {

    /**
     * Метод тестирования сортировки
     */
    @Test
    public void sort() {
        MyList<Integer> list = new MyArrayList<>();
        list.add(3);
        list.add(2);
        list.add(5);

        Comparator<Integer> comparator = Integer::compareTo;

        Sorter<Integer> sorter = new SelectionSorter<>();
        sorter.sort(list, comparator);

        Assert.assertEquals(list.get(0), Integer.valueOf(2));
        Assert.assertEquals(list.get(1), Integer.valueOf(3));
        Assert.assertEquals(list.get(2), Integer.valueOf(5));
    }
}