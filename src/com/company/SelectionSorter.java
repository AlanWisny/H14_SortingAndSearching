package com.company;

import java.util.Arrays;

// The sort method of this class sorts an array, using the selection sort algorithm.
public class SelectionSorter {

    // Sorts an array, using selection sort.
    // P14.1 Descending order
    public static void sort(int[] a) {
        for(int i = 0; i < a.length -1; i++) {
            int minPos = minimumPosition(a, i);
//            MyArrayUtil.swap(a, minPos, i);
            MyArrayUtil.reverse(a);
            Arrays.sort(a);
//            bubbleSort(a);
        }
    }

    // Finds the smallest element in a tail range of the array.
    private static int minimumPosition(int[] a, int from) {
        int minPos = from;
        for(int i = from +1; i < a.length; i++) {
            if(a[i] < a[minPos]) {
                minPos = i;
            }
            return minPos;
        }
        return -1;
    }

    // Sort an order by their values using the Bubble sort method.
    public void bubbleSort(int[] array) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] > array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }
}
