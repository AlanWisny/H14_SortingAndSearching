package com.company;

import java.util.Arrays;

// This program demonstrates the selection sort algorithm by sorting an array filled with random numbers.
public class Main {

    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        MyArrayUtil my = new MyArrayUtil();
        int[] a = my.randomIntArray(20, 100);
        System.out.println(Arrays.toString(a));

        sw.start();
        SelectionSorter.sort(a);
        sw.stop();

        System.out.println(Arrays.toString(a));
    }
}
