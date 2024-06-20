package com.example;

import com.example.task3.ArrayToString;

public class ArrayToStringTest {
    public static void main(String[] args) {
        String[] inputArray = new String[] {"1, 2, 0", "4, 5"};
        String result = ArrayToString.arrayToString(inputArray);
        System.out.println("Sorted numbers: " + "\"" + result + "\"");
    }
}
