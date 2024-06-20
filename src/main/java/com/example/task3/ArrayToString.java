package com.example.task3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayToString {
    public static String arrayToString(String[] array){
        return Arrays.stream(array)
                .flatMap(s -> Arrays.stream(s.split(",")))
                .map(String::trim)
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
