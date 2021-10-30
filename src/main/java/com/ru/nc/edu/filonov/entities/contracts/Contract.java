package com.ru.nc.edu.filonov.entities.contracts;

import com.ru.nc.edu.filonov.entities.person.Person;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Contract {

    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;
    private int number;
    private Person owner;

    public Contract(Long id, LocalDate startDate, LocalDate endDate, int number, Person owner) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.number = number;
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public int getNumber() {
        return number;
    }

    public Person getOwner() {
        return owner;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return Objects.equals(id, contract.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contract{");
        sb.append("id=").append(id);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", number=").append(number);
        sb.append(", owner=").append(owner);
        sb.append('}');
        return sb.toString();
    }
}
