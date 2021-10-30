package com.ru.nc.edu.filonov.utils;

public interface MyList<T> {

    int size();
    boolean isEmpty();
    boolean contains(T item);
    boolean add(T item);
    boolean remove(T item);
    boolean removeByIndex(int index);
    void clear();
    T get(int index);
}
