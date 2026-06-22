package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertTest {
    Main calculator = new Main();
    @Test
    public void testAssertions() {

        // Assert Equals
        assertEquals(5, calculator.add(2, 3));

        // Assert True
        assertTrue(calculator.isPositive(10));

        // Assert False
        assertFalse(calculator.isPositive(-10));

        // Assert Null
        assertNull(calculator.getName());

        // Assert Not Null
        assertNotNull(calculator.createObject());
    }
}