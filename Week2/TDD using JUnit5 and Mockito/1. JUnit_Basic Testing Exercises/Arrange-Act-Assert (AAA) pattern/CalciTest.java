package com.example.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalciTest {

    private Calci calculator;

    @BeforeEach
    void setUp() {
        // Arrange
        calculator = new Calci();
        System.out.println("Setup done.");
    }

    @AfterEach
    void tearDown() {
        calculator = null;
        System.out.println("Teardown done.");
    }

    @Test
    void testAddition() {
        // Act
        int result = calculator.add(4, 6);

        // Assert
        assertEquals(10, result);
    }

    @Test
    void testSubtraction() {
        // Act
        int result = calculator.subtract(10, 3);

        // Assert
        assertEquals(7, result);
    }
}
