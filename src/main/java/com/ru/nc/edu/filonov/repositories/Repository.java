package com.ru.nc.edu.filonov.repositories;

import java.util.Collection;
import java.util.Optional;

public interface Repository<T> {

    boolean add(T item);
    boolean addAll(Collection<T> items);
    boolean removeById(Long id);
    Optional<T> get(Long id);
}
