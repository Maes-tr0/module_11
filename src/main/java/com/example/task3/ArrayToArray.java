package com.example.task3;

import java.util.Arrays;
import java.util.List;

public class ArrayToArray {

    public static List<Integer> toArray(List<String> list){
        return list.stream()
                .flatMap(s -> Arrays.stream(s.split(",")))
                .map(String::trim)
                .map(Integer::parseInt)
                .toList();
    }
}
