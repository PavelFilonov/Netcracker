package com.ru.nc.edu.filonov.repositories;

import com.ru.nc.edu.filonov.entities.contracts.Contract;
import com.ru.nc.edu.filonov.utils.MyArrayList;
import com.ru.nc.edu.filonov.utils.MyList;

import java.util.Optional;

public class ContractRepository implements Repository<Contract> {

    private MyList<Contract> contracts = new MyArrayList<>();

    @Override
    public boolean add(Contract item) {
        if (contains(item))
            return false;
        contracts.add(item);
        return true;
    }

    @Override
    public void addAll(MyList<Contract> items) {
        for (int i = 0; i < items.size(); i++) {
            if (!contains(items.get(i)))
                contains(items.get(i));
        }
    }

    @Override
    public boolean removeById(Long id) {
        Optional<Contract> item = get(id);
        if (item.isPresent()) {
            contracts.remove(item.get());
            return true;
        }
        return false;
    }

    @Override
    public Optional<Contract> get(Long id) {
        for (int i = 0; i < contracts.size(); i++) {
            if (contracts.get(i).getId().equals(id))
                return Optional.of(contracts.get(i));
        }
        return Optional.empty();
    }

    private boolean contains(Contract item) {
        for (int i = 0; i < contracts.size(); i++) {
            if (contracts.get(i).equals(item))
                return true;
        }
        return false;
    }
}
