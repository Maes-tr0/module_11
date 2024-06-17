package com.example;

import java.util.Arrays;
import java.util.stream.Stream;
import static com.example.task4.LCG.generateRandomNumbers;

public class LCGTest {
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        long seed = 12345L;

        Stream<Long> randomNumbers = generateRandomNumbers(seed, a, c, m).limit(10);
        System.out.println("First 10 numbers: " + Arrays.toString(randomNumbers.toArray()));
    }
}
