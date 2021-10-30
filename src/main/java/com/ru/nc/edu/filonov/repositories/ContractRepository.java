package com.ru.nc.edu.filonov.repositories;

import com.ru.nc.edu.filonov.entities.contracts.Contract;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class ContractRepository implements Repository<Contract> {

    private Set<Contract> contracts = new HashSet<>();

    @Override
    public boolean add(Contract item) {
        return contracts.add(item);
    }

    @Override
    public boolean addAll(Collection<Contract> items) {
        return contracts.addAll(items);
    }

    @Override
    public boolean removeById(Long id) {
        Optional<Contract> item = get(id);
        if (item.isPresent()) {
            contracts.remove(item);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Contract> get(Long id) {
        return contracts.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst();
    }
}
