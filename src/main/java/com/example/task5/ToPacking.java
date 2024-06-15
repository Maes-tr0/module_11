package com.example.task5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToPacking {
    public static <T> Stream<T> shuffleStreams(Stream<T> first, Stream<T> second) {
        List<T> result = Stream.concat(first, second).collect(Collectors.toList());
        Collections.shuffle(result);
        return result.stream();
    }
}
