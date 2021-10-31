package com.ru.nc.edu.filonov.utils;

import org.junit.Assert;
import org.junit.Test;

/**
 * Класс для тестирования методов класса MyArrayList
 */
public class MyArrayListTest {

    /**
     * Метод тестирования проверки списка на пустоту
     */
    @Test
    public void isEmpty() {
        MyList<Integer> list = new MyArrayList<>();
        Assert.assertTrue(list.isEmpty());
        list.add(1);
        Assert.assertFalse(list.isEmpty());
    }

    /**
     * Метод тестирования вхождения объекта в список
     */
    @Test
    public void contains() {
        MyList<Integer> list = new MyArrayList<>();
        list.add(1);
        Assert.assertTrue(list.contains(1));
    }

    /**
     * Метод тестирования добавления объекта
     */
    @Test
    public void add() {
        MyList<Integer> list = new MyArrayList<>();
        Assert.assertEquals(list.size(), 0);
        list.add(10);
        Assert.assertEquals(list.size(), 1);
        Assert.assertEquals(list.get(0).intValue(), 10);
        list.add(20);
        Assert.assertEquals(list.size(), 2);
        Assert.assertEquals(list.get(1).intValue(), 20);
    }

    /**
     * Метод тестирования добавления списка объектов
     */
    @Test
    public void addAll() {
        MyList<Integer> list1 = new MyArrayList<>();
        Assert.assertEquals(list1.size(), 0);
        MyList<Integer> list2 = new MyArrayList<>();
        list2.add(10);
        list2.add(20);
        list1.addAll(list2);
        Assert.assertEquals(list1.size(), 2);
    }

    /**
     * Метод тестирования удаления объекта
     */
    @Test
    public void remove() {
        MyList<Integer> list = new MyArrayList<>();
        Assert.assertEquals(list.size(), 0);
        list.add(10);
        Assert.assertEquals(list.size(), 1);
        list.remove(10);
        Assert.assertEquals(list.size(), 0);
    }

    /**
     * Метод тестирования удаления объекта по индексу
     */
    @Test
    public void removeByIndex() {
        MyList<Integer> list = new MyArrayList<>();
        Assert.assertEquals(list.size(), 0);
        list.add(10);
        Assert.assertEquals(list.size(), 1);
        list.removeByIndex(0);
        Assert.assertEquals(list.size(), 0);
    }

    /**
     * Метод тестирования очищения списка
     */
    @Test
    public void clear() {
        MyList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        Assert.assertEquals(list.size(), 2);
        list.clear();
        Assert.assertEquals(list.size(), 0);
    }

    /**
     * Метод тестирования получения объекта по индексу
     */
    @Test
    public void get() {
        MyList<Integer> list = new MyArrayList<>();
        list.add(10);
        Assert.assertEquals(list.get(0).intValue(), 10);
    }
}