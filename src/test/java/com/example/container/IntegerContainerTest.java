package com.example.container;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntegerContainerTest {

    @Test
    void testAddAndGet() {
        IntegerContainer container = new IntegerContainer();
        container.add(10);
        container.add(20);
        assertEquals(10, container.get(0));
        assertEquals(20, container.get(1));
        assertEquals(2, container.size());
    }

    @Test
    void testRemove() {
        IntegerContainer container = new IntegerContainer();
        container.add(5);
        container.add(15);
        container.add(25);
        container.remove(1); // удаляем 15
        assertEquals(5, container.get(0));
        assertEquals(25, container.get(1));
        assertEquals(2, container.size());
    }

    @Test
    void testRemoveThrowsException() {
        IntegerContainer container = new IntegerContainer();
        assertThrows(IndexOutOfBoundsException.class, () -> container.remove(0));
    }

    @Test
    void testCapacityExpansion() {
        IntegerContainer container = new IntegerContainer();
        for (int i = 0; i < 20; i++) {
            container.add(i);
        }
        assertEquals(20, container.size());
        assertEquals(15, container.get(15));
    }
}