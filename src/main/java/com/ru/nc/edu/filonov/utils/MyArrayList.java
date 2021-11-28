package com.ru.nc.edu.filonov.utils;

/**
 * Класс списка, основанного на массиве
 * @param <T> тип данных
 */
public class MyArrayList<T>  implements MyList<T> {

    /** Размер списка */
    private int size = 0;

    /** Первоначальный размер массива */
    private static final int INIT_SIZE = 10;

    /** Константа для редактирования размера массива */
    private static final int CUT_RATE = 4;

    /** Массив, на котором основан список */
    private Object[] array = new Object[INIT_SIZE];

    /**
     * Getter поля размера списка
     * @return размер списка
     */
    public int size() {
        return size;
    }

    /**
     * Метод проверки списка на пустоту
     * @return логическая переменная (true - пустой, false - не пустой)
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Метод, проверяющий входит ли объект в список
     * @param o проверяемый объект
     * @return логическая переменная (true - входит, false - не входит)
     */
    public boolean contains(T o) {
        for (Object item: array) {
            if (o.equals(item))
                return true;
        }
        return false;
    }

    /**
     * Метод добавления объекта в список
     * @param o добавляемый метод
     * @return результат добавления (true - добавлен, false - не добавлен)
     */
    public boolean add(T o) {
        if (size == array.length)
            resize(2 * size);
        array[size++] = o;
        return true;
    }

    /**
     * Метод добавления списка объектов
     * @param items список объектов
     */
    @Override
    public void addAll(MyList<T> items) {
        for (int i = 0; i < items.size(); i++) {
            add(items.get(i));
        }
    }

    /**
     * Метод изменения размера массива, на котором основан список
     * @param newSize новый размер массива
     */
    private void resize(int newSize) {
        Object[] newArray = new Object[newSize];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    /**
     * Метод удаления объекта списка
     * @param o удаляемый объект
     * @return результат удаления (true - удалён, false - не удалён)
     */
    public boolean remove(T o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(array[i]))
                return removeByIndex(i);
        }

        return false;
    }

    /**
     * Метод удаления объекта списка по индексу
     * @param index индекс объекта
     * @return результат удаления (true - удалён, false - не удалён)
     */
    public boolean removeByIndex(int index) {
        if (index < 0 || index >= size)
            return false;

        System.arraycopy(array, index + 1, array, index, size - index);

        array[size--] = null;

        if (array.length > INIT_SIZE && size < array.length / CUT_RATE)
            resize(array.length / 2);

        return true;
    }

    /**
     * Метод очищения списка
     */
    public void clear() {
        size = 0;
        array = new Object[INIT_SIZE];
    }

    /**
     * Метод получения объекта списка по индексу
     * @param index индекс объекта
     * @return объект списка с заданным индексом
     */
    public T get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        return (T) array[index];
    }

    /**
     * @return клон списка
     */
    @Override
    public MyList<T> copy() {
        MyList<T> newList = new MyArrayList<>();
        newList.addAll(this);
        return newList;
    }
}
