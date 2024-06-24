package com.example.task5;

import java.util.*;
import java.util.stream.Stream;

public class ToPacking {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> result = new ArrayList<>();
        Iterator<T> firstIterator = first.iterator();

        second.filter(f -> firstIterator.hasNext())
                .forEach(f -> {
                    result.add(f);
                    result.add(firstIterator.next());
                });
        return result.stream();
    }
}
