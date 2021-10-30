package com.ru.nc.edu.filonov.repositories;

import java.util.Collection;
import java.util.UUID;

public interface Repository<T> {

    boolean add(T item);
    boolean addAll(Collection<T> items);
    boolean removeById(UUID id);
    T get(UUID id);
}
