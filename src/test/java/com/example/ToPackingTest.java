package com.example;

import com.example.task5.ToPacking;

import java.util.stream.Stream;

public class ToPackingTest {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("A", "B", "C", "D", "E", "F");
        Stream<String> stream2 = Stream.of("1", "2", "3");

        Stream<String> zippedStream = ToPacking.zip(stream1, stream2);
        zippedStream.forEach(System.out::println);
    }
}
