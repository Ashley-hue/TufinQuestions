package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main main;
    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void longestString() {
        List<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');

        List<String> stringList = new ArrayList<>();
        stringList.add("ABDCDCAB");
        stringList.add("AADCDCAB");
        stringList.add("ABDCECAB");
        stringList.add("ABDCABACAB");

    }

    @Test
    void noDupes() {
        Main.noDupes("FGIEENCGA");
        assertFalse(Main.noDupes("HRIABCD"));
    }

    @Test
    void exists() {
        String letters = "ABDCDCAB";

        List<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');

        Main.exists(characters, letters);
    }
}