package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main main;
    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @Test
    void findOperations() {
        int[] arr = {1,2,3,4,5};
        Main.findOperations(arr);
    }
}