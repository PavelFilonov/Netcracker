package com.ru.nc.edu.filonov.entities.contracts;

import com.ru.nc.edu.filonov.entities.person.Person;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Абстрактный класс контракта
 */
public abstract class Contract {

    /** Уникальный идентификатор контракта */
    private Long id;

    /** Дата начала контракта */
    private LocalDate startDate;

    /** Дата окончания контракта*/
    private LocalDate endDate;

    /** Номер контракта */
    private int number;

    /** Владелец контракта */
    private Person owner;

    /**
     * Конструктор класса
     * @param id уникальный идентификатор
     * @param startDate дата начала
     * @param endDate дата окончания
     * @param number номер
     * @param owner владелец (объект класса Person)
     */
    public Contract(Long id, LocalDate startDate, LocalDate endDate, int number, Person owner) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.number = number;
        this.owner = owner;
    }

    /**
     * Getter уникального идентификатора
     * @return уникальный идентификатор
     */
    public Long getId() {
        return id;
    }

    /**
     * Getter даты начала
     * @return дата начала
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * Getter даты окончания
     * @return дата окончания
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * Getter номера
     * @return номер
     */
    public int getNumber() {
        return number;
    }

    /**
     * Getter владельца
     * @return владелец (объект класса Person)
     */
    public Person getOwner() {
        return owner;
    }

    /**
     * Setter наты окончания
     * @param endDate дата окончания
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /**
     * Setter номера
     * @param number номер
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Setter владельца
     * @param owner владелец (объект класса Person)
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }

    /**
     * Переопределённый метод сравнения
     * @param o объект, с которым происходит сравнение
     * @return результат сравнения
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return Objects.equals(id, contract.id);
    }

    /**
     * Переопределённый метод hash-кода
     * @return hash-код
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    /**
     * Переопределённый метод представления объекта в строковой форме
     * @return строка, в которой содержится информация об объекте
     */
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
