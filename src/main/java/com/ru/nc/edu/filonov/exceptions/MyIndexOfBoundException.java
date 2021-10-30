package com.ru.nc.edu.filonov.exceptions;

public class MyIndexOfBoundException extends Exception {

    public MyIndexOfBoundException() {
        super("Выход за границы массива");
    }

    public MyIndexOfBoundException(int index, int size) {
        super(String.format("Индекс %d выходит за груницы массива длины %d", index, size));
    }

    public MyIndexOfBoundException(int index) {
        super(String.format("Индекс %d выходит за груницы массива", index));
    }
}
