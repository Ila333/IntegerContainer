package com.example.container;

/**
 * Контейнер для хранения целых чисел на основе массива.
 * Позволяет добавлять, получать и удалять элементы.
 */
public class IntegerContainer {
    private int[] data;
    private int size;

    /**
     * Создаёт пустой контейнер с начальной ёмкостью 10.
     */
    public IntegerContainer() {
        data = new int[10];
        size = 0;
    }

    /**
     * Добавляет число в конец контейнера.
     *
     * @param value добавляемое значение
     */
    public void add(int value) {
        if (size == data.length) {
            increaseCapacity();
        }
        data[size] = value;
        size++;
    }

    private void increaseCapacity() {
        int[] newData = new int[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }
}