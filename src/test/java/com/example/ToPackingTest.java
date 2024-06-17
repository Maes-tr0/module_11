package com.example;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.example.task5.ToPacking.interleaveStreams;

public class ToPackingTest {
    public static void main(String[] args) {
        Stream<Integer> firstStream = Stream.of(1, 3, 5);
        Stream<Integer> secondStream = Stream.of(2, 4, 6, 8, 10, 12);

        Stream<Integer> resultStream = interleaveStreams(firstStream, secondStream);
        String result = resultStream.map(String::valueOf).collect(Collectors.joining(", "));
        System.out.println("Результат: " + result);
    }
}
