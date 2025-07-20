package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main main;

    @org.junit.jupiter.api.Test
    void uniqueSums() {
    }

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @Test
    void testUniqueSums() {
        int result = 20;
        int[] arr = {1,5,8,7,6};
        Main.uniqueSums(result, arr);
    }
}