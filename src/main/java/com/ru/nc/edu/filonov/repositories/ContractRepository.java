package com.ru.nc.edu.filonov.repositories;

import com.ru.nc.edu.filonov.entities.contracts.Contract;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ContractRepository implements Repository<Contract> {

    private final List<Contract> contracts = new ArrayList<>();


    @Override
    public boolean add(Contract item) {
        return false;
    }

    @Override
    public boolean addAll(Collection<Contract> items) {
        return false;
    }

    @Override
    public boolean removeById(Long id) {
        return false;
    }

    @Override
    public Contract get(Long id) {
        return null;
    }
}