package com.example.task1_and_task2;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class NamesInvoker {

    private int getIndexInLine(String name) {
        return Integer.parseInt(name.split("\\.")[0]);
    }

    public String filterNameWithAnOddIndex(List<String> names) {
        AtomicInteger counter = new AtomicInteger();
        return names.stream()
                .map(name -> counter.incrementAndGet() + ". " + name)
                .filter(line -> getIndexInLine(line) % 2 != 0)
                .collect(Collectors.joining(", "));
    }

    public String filterNameWithAnEvenIndex(List<String> names) {
        AtomicInteger counter = new AtomicInteger();
        return names.stream()
                .map(name -> counter.incrementAndGet() + ". " + name)
                .filter(line -> getIndexInLine(line) % 2 == 0)
                .collect(Collectors.joining(", "));
    }

    public List<String> getUpperCaseNamesInDescendingOrder(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toList();
    }

    public List<String> getUpperCaseNamesInAscendingOrder(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.naturalOrder())
                .toList();
    }
}
