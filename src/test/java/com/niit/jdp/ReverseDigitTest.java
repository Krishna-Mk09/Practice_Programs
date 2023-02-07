package com.niit.jdp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseDigitTest {
    ReverseDigit reverseDigit;

    @BeforeEach
    void setUp() {
        reverseDigit = new ReverseDigit();
    }

    @AfterEach
    void tearDown() {
        reverseDigit = null;
    }

    @Test
    void getReverseDigit() {
        int number = 12345;
        int expected = 54321;
        int actual = reverseDigit.getReverseDigit(number);
        Assertions.assertEquals(expected, actual);
    }
}