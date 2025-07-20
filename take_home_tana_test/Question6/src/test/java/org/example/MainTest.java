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
    void frequentWords() {
        String words = "hi there care to discuss algorithm basis or how to solve algorithm or";
        Main.frequentWords(words);
        String word = "or or hey hey you you at where how when";
        Main.frequentWords(word);
    }
}