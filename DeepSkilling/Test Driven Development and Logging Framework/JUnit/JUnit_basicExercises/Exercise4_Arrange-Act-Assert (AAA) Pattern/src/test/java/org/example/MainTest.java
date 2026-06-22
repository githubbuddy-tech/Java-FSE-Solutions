package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testToUpper() {
        Main utils = new Main();
        String input = "hello";
        String result = utils.toUpper(input);
        assertEquals("HELLO", result);

    }
}