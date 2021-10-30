package com.ru.nc.edu.filonov.repositories;

import com.ru.nc.edu.filonov.utils.MyList;

import java.util.Optional;

public interface Repository<T> {

    boolean add(T item);
    void addAll(MyList<T> items);
    boolean removeById(Long id);
    Optional<T> get(Long id);
}
