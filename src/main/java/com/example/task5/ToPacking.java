package com.example.task5;

import java.util.*;
import java.util.stream.Stream;

public class ToPacking {

    public static <T> Stream<T> interleaveStreams(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();
        List<T> result = new ArrayList<>();

        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            result.add(firstIterator.next());
            result.add(secondIterator.next());
        }

        while (firstIterator.hasNext()) {
            result.add(firstIterator.next());
        }

        while (secondIterator.hasNext()) {
            result.add(secondIterator.next());
        }

        return result.stream();
    }
}
