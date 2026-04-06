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

    /**
     * Возвращает элемент по индексу.
     * @param index индекс (от 0)
     * @return значение элемента
     * @throws IndexOutOfBoundsException если индекс некорректен
     */
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return data[index];
    }

    /**
     * Удаляет элемент по индексу, сдвигая остальные влево.
     * @param index индекс удаляемого элемента
     * @throws IndexOutOfBoundsException если индекс некорректен
     */
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    /**
     * Возвращает текущее количество элементов.
     * @return размер контейнера
     */
    public int size() {
        return size;
    }
}