package com.ru.nc.edu.filonov.repositories;

import java.util.Collection;

public interface Repository<T> {

    boolean add(T item);
    boolean addAll(Collection<T> items);
    boolean removeById(Long id);
    T get(Long id);
}
