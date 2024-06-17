package com.example;

import java.util.Arrays;
import java.util.List;

import static com.example.task3.ArrayToArray.toArray;

public class ArrayToArrayTest {
    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("1, 2, 0", "4, 5");
        String result = toArray(inputList);
        System.out.println("Sorted numbers: " + result);
    }
}
