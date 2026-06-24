package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Main {
    private static final Logger logger =
            LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        int age = -5;
        if (age < 0) {
            logger.warn("Invalid age entered: {}", age);
        }
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            logger.error("An error occurred while performing division", e);
        }
        logger.info("Application execution completed");
    }
}