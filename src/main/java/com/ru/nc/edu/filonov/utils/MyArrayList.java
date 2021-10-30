package com.ru.nc.edu.filonov.utils;

import com.ru.nc.edu.filonov.exception.MyIndexOfBoundException;

public class MyArrayList <T>  implements MyList<T> {

    private int size = 0;
    private static final int INIT_SIZE = 10;
    private static final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(T o) {
        for (Object item: array) {
            if (o.equals(item))
                return true;
        }
        return false;
    }

    public boolean add(T o) {
        if (size == array.length)
            resize(2 * size);
        array[size++] = o;
        return true;
    }

    private void resize(int newSize) {
        Object[] newArray = new Object[newSize];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public boolean remove(T o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(array[i]))
                return removeByIndex(i);
        }

        return false;
    }

    public boolean removeByIndex(int index) {
        if (index < 0 || index >= size)
            return false;

        System.arraycopy(array, index + 1, array, index, size - index);

        array[size--] = null;

        if (array.length > INIT_SIZE && size < array.length / CUT_RATE)
            resize(array.length / 2);

        return true;
    }

    public void clear() {
        size = 0;
        array = new Object[INIT_SIZE];
    }

    public T get(int index) throws MyIndexOfBoundException {
        if (index < 0 || index >= size) {
            throw new MyIndexOfBoundException(index, size);
        }
        return (T) array[index];
    }
}
