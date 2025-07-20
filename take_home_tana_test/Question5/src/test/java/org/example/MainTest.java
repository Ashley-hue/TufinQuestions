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
    void findDistance() {
        int[] arr = {2,4,7,1,2,6,4,1,1,1};
        Main.findDistance(arr);
    }
}