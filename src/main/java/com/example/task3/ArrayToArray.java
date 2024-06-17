package com.example.task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToArray {

    public static String toArray(List<String> list){
        return list.stream()
                .flatMap(s -> Arrays.stream(s.split(",")))
                .map(String::trim)
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
