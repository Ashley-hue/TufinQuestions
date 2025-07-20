package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @Test
    void convertStrings() {
        LinkedList<String> list = new LinkedList<>();//Adding elements to nodes
        list.add("H1");
        list.add("H2");
        list.add("H3");
        list.add("H4");
        list.add("H5");
        list.add("H6");
        Main.convertStrings(list);
    }

    @Test
    void rotate() {
        Node head = null;
        Main.rotate(head);
    }

    @Test
    void rotateRight() {
        int n = 2;
        Node head = null;
        Main.rotateRight(head, 2);
    }

    @Test
    void printList() {
        Node head = null;
        Main.printList(head);
    }
}