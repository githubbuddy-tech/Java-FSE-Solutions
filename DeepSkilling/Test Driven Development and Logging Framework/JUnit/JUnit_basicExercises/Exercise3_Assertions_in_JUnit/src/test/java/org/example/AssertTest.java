package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertTest {
    Main calculator = new Main();
    @Test
    public void testAssertions() {
        assertEquals(5, calculator.add(2, 3));
        assertTrue(calculator.isPositive(10));
        assertFalse(calculator.isPositive(-10));
        assertNull(calculator.getName());
        assertNotNull(calculator.createObject());
    }
}