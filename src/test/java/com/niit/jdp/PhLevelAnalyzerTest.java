package com.niit.jdp;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class PhLevelAnalyzerTest {
    PhLevelAnalyzer phLevelAnalyzer;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        phLevelAnalyzer = new PhLevelAnalyzer();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        phLevelAnalyzer = null;
    }

    @org.junit.jupiter.api.Test
    void getPhValue() {
        int phValue = 7;
        String expected = "neutral";
        String actual = phLevelAnalyzer.getPhValue(phValue);
        Assertions.assertEquals(expected, actual);
    }
}