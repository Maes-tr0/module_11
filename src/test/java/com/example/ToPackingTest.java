package com.example;

import com.example.task5.ToPacking;

import java.util.List;

public class ToPackingTest {
    public static void main(String[] args) {
        List<String> list1 = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9");
        List<String> list2 = List.of("0", "0", "0", "0", "0", "0", "0");

        List<String> shuffledResult = ToPacking.shuffleStreams(list1.stream(), list2.stream()).toList();
        System.out.println(shuffledResult);
    }
}
