package com.ru.nc.edu.filonov.entities.person;

import com.ru.nc.edu.filonov.enums.Sex;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 * Класс, описывающий человека
 */
public class Person {

    /** Уникальный идентификатор */
    private Long id;

    /** ФИО */
    private String fullName;

    /** Дата рождения */
    private LocalDate birthday;

    /** Пол */
    private Sex sex;

    /** Серия и номер паспорта */
    private int passportSeriesAndNumber;

    /**
     * Конструктор класса со всеми параметрами
     * @param id уникальный идентификатор
     * @param fullName ФИО
     * @param birthday дата рождения
     * @param sex пол
     * @param passportSeriesAndNumber серия и номер паспорта
     */
    public Person(Long id, String fullName, LocalDate birthday, Sex sex, int passportSeriesAndNumber) {
        this.id = id;
        this.fullName = fullName;
        this.birthday = birthday;
        this.sex = sex;
        this.passportSeriesAndNumber = passportSeriesAndNumber;
    }

    /**
     * Getter уникального идентификатора
     * @return уникальный идентификатор
     */
    public Long getId() {
        return id;
    }

    /**
     * Getter ФИО
     * @return ФИО
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Getter даты рождения
     * @return дата рождения
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /**
     * Getter пола
     * @return пол
     */
    public Sex getSex() {
        return sex;
    }

    /**
     * Getter серии и номера паспорта
     * @return серия и номер паспорта
     */
    public int getPassportSeriesAndNumber() {
        return passportSeriesAndNumber;
    }

    /**
     * Setter ФИО
     * @param fullName
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Setter даты рождения
     * @param birthday дата рождения
     */
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    /**
     * Setter пола
     * @param sex пол
     */
    public void setSex(Sex sex) {
        this.sex = sex;
    }

    /**
     * Setter серии и номера паспорта
     * @param passportSeriesAndNumber серия и номер паспорта
     */
    public void setPassportSeriesAndNumber(int passportSeriesAndNumber) {
        this.passportSeriesAndNumber = passportSeriesAndNumber;
    }

    /**
     * Getter вычисляемого поля возраста
     * @return возраст
     */
    public int getAge() {
        return Period.between(birthday, LocalDate.now()).getYears();
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
        Person person = (Person) o;
        return passportSeriesAndNumber == person.passportSeriesAndNumber &&
                Objects.equals(id, person.id);
    }

    /**
     * Переопределённый метод hash-кода
     * @return hash-код
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, passportSeriesAndNumber);
    }

    /**
     * Переопределённый метод представления объекта в строковой форме
     * @return строка, в которой содержится информация об объекте
     */
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
