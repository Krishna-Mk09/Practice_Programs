package com.niit.jdp;

import java.util.Collections;

public class ArraysExample {
    public static void main(String[] args) {
        int marks[] = {11, 22, 33, 44, 55, 66};
        ArraysExample arraysExample = new ArraysExample();
        int[] result = arraysExample.reverseAnArray(marks);
        System.out.println(result);
    }

    public int[] reverseAnArray(int marks[]) {
        int[] reverseArray = new int[marks.length];
        Collections.reverse(java.util.Arrays.asList(marks));
        System.out.println(java.util.Arrays.asList(marks));
        return reverseArray;
    }
}
