package com.ru.nc.edu.filonov.entities.person;

import com.ru.nc.edu.filonov.enums.Sex;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;
import java.util.UUID;

public class Person {

    private UUID id;
    private String fullName;
    private LocalDate birthday;
    private Sex sex;
    private int passportSeriesAndNumber;

    public Person(UUID id, String fullName, LocalDate birthday, Sex sex, int passportSeriesAndNumber) {
        this.id = id;
        this.fullName = fullName;
        this.birthday = birthday;
        this.sex = sex;
        this.passportSeriesAndNumber = passportSeriesAndNumber;
    }

    public Person(String fullName, LocalDate birthday, Sex sex, int passportSeriesAndNumber) {
        this(UUID.randomUUID(), fullName, birthday, sex, passportSeriesAndNumber);
    }

    public UUID getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Sex getSex() {
        return sex;
    }

    public int getPassportSeriesAndNumber() {
        return passportSeriesAndNumber;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setPassportSeriesAndNumber(int passportSeriesAndNumber) {
        this.passportSeriesAndNumber = passportSeriesAndNumber;
    }

    public int getAge() {
        return Period.between(birthday, LocalDate.now()).getYears();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return passportSeriesAndNumber == person.passportSeriesAndNumber &&
                Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, passportSeriesAndNumber);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("id=").append(id);
        sb.append(", fullName='").append(fullName).append('\'');
        sb.append(", birthday=").append(birthday);
        sb.append(", sex=").append(sex);
        sb.append(", passportSeriesAndNumber=").append(passportSeriesAndNumber);
        sb.append('}');
        return sb.toString();
    }
}
