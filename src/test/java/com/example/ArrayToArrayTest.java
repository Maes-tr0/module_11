package com.example;

import com.example.task3.ArrayToArray;

import java.util.Arrays;
import java.util.List;

public class ArrayToArrayTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1, 2, 0", "4, 5");
        List<Integer> integerList = ArrayToArray.toArray(list);

        System.out.println("Original strings list:\n" + list + "\nsize: " + list.size());

        System.out.println("\n\nFinal integer list:\n" + integerList + "\nsize: " + integerList.size());

    }
}
