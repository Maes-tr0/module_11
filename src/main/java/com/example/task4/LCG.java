package com.example.task4;

import java.util.stream.Stream;

public class LCG {
    private final int size;
    private static final long A = 1664525;
    private static final long C = 1013904223;
    private static final long M = (long) Math.pow(2, 32);
    private static final long SEED = 12345;

    public LCG(int size) {
        this.size = size;
    }

    public LCG() {
        this(100);
    }

    public Stream<Long> generateRandomNumber() {
        return Stream.iterate(SEED, x -> (A * x * C) % M).limit(size);
    }
}
