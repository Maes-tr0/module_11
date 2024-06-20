package com.example.task1_and_task2;

import java.util.Comparator;
import java.util.List;
import java.util.StringJoiner;
import java.util.concurrent.atomic.AtomicInteger;

public class NamesInvoker {
    private final List<String> names;

    public NamesInvoker(List<String> names) {
        AtomicInteger counter = new AtomicInteger();
        this.names = names.stream()
                .map(name -> counter.incrementAndGet() + ". " + name)
                .toList();
    }

    private String listToString(List<String> result) {
        StringJoiner sj = new StringJoiner(", ");
        for (String name : result) {
            sj.add(name);
        }
        return sj.toString();
    }

    private int getIndexInLine(String name) {
        return Integer.parseInt(name.split("\\.")[0]);
    }

    private String getNameInLine(String name) {
        return name.split("\\.")[1];
    }

    public String filterNameWithAnOddIndex() {
        List<String> result = names.stream()
                .filter(line -> getIndexInLine(line) % 2 != 0)
                .toList();
        return listToString(result);
    }

    public String filterNameWithAnEvenIndex() {
        List<String> result = names.stream()
                .filter(line -> getIndexInLine(line) % 2 == 0)
                .toList();
        return listToString(result);
    }

    public List<String> getNames() {
        return List.copyOf(names);
    }

    public List<String> getUpperCaseNamesInDescendingOrder() {
        return names.stream()
                .map(name -> getNameInLine(name).toUpperCase())
                .sorted(Comparator.reverseOrder())
                .toList();
    }

    public List<String> getUpperCaseNamesInAscendingOrder() {
        return names.stream()
                .map(name -> getNameInLine(name).toUpperCase())
                .sorted(Comparator.naturalOrder())
                .toList();
    }
}
