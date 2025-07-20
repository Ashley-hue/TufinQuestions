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
    void findUniqueProduct() {
        String[] words = {"Apple", "Computer", "Apple", "Orange", "Dog"};
        Main.findUniqueProduct(words);
    }
}