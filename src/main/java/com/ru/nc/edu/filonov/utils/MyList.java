package com.ru.nc.edu.filonov.utils;

public interface MyList<T> {

    /**
     * Getter поля размера списка
     *
     * @return размер списка
     */
    int size();

    /**
     * Метод проверки списка на пустоту
     *
     * @return логическая переменная (true - пустой, false - не пустой)
     */
    boolean isEmpty();

    /**
     * Метод, проверяющий входит ли объект в список
     *
     * @param item проверяемый объект
     * @return логическая переменная (true - входит, false - не входит)
     */
    boolean contains(T item);

    /**
     * Метод добавления объекта в список
     *
     * @param item добавляемый метод
     * @return результат добавления (true - добавлен, false - не добавлен)
     */
    boolean add(T item);

    /**
     * Метод добавления списка объектов
     *
     * @param items список объектов
     */
    void addAll(MyList<T> items);

    /**
     * Метод удаления объекта списка
     *
     * @param item удаляемый объект
     * @return результат удаления (true - удалён, false - не удалён)
     */
    boolean remove(T item);

    /**
     * Метод удаления объекта списка по индексу
     *
     * @param index индекс объекта
     * @return результат удаления (true - удалён, false - не удалён)
     */
    boolean removeByIndex(int index);

    /**
     * Метод очищения списка
     */
    void clear();

    /**
     * Метод получения объекта списка по индексу
     * @param index индекс объекта
     * @return объект списка с заданным индексом
     */
    T get(int index);

    /**
     * @return клон списка
     */
    MyList<T> copy();
}
