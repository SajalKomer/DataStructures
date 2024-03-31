package com.codewithmosh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] names) {
        Tree tree = new Tree();
        tree.insert(20);
        tree.insert(10);
        tree.insert(6);
        tree.insert(21);
        tree.insert(3);
        tree.insert(8);
        tree.insert(30);
        tree.insert(4);
        System.out.println(tree.isBinarySearchTree());
    }
}

