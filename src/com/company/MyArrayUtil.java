package com.company;

import java.util.Random;

// This class contains utility methods for array manipulation.
public class MyArrayUtil {
    private static Random generator = new Random();

    // Creates an array filled with random values.
    public static int[] randomIntArray(int length, int n) {
        int[] a = new int[length];

        for(int i = 0; i < a.length; i++) {
            a[i] = generator.nextInt(n);
        }
        return a;
    }

    // Swaps two entries of an array.
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // Reverse the order of an array.
    // Mogelijk ook een loop maken waarbij je de temp van de 1ste waarde van i in de laatste waarde van j voegt.
    public static void reverse(int[] array) {
        int middleIndex = (array.length) / 2;

        for (int i = 0; i < middleIndex; i++) {
            int temporaryVariable = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temporaryVariable;
        }
    }



}
