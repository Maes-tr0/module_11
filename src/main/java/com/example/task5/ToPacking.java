package com.example.task5;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ToPacking {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        Iterable<T> iterable = () -> new Iterator<>() {
            private boolean toggle = true;

            @Override
            public boolean hasNext() {
                return firstIterator.hasNext() && secondIterator.hasNext();
            }

            @Override
            public T next() {
                toggle = !toggle;
                if (toggle) {
                    return firstIterator.next();
                } else {
                    return secondIterator.next();
                }
            }
        };

        return StreamSupport.stream(iterable.spliterator(), false);
    }
}
