package com.example;

import com.example.task4.LCG;

import java.util.stream.Stream;

public class LCGTest {
    public static void main(String[] args) {
        LCG lcg = new LCG(3);
        Stream<Long> longStream = lcg.generateRandomNumber();
        longStream.forEach(System.out::println);
    }
}
