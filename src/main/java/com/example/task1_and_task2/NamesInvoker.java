package com.example.task1_and_task2;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class NamesInvoker {
    private final Collection<String> names = new ArrayList<>();

    private static int getNumberFromLine(String line) {
        String[] parts = line.split("\\.", 2);
        return Integer.parseInt(parts[0]);
    }

    private static String getNameFromLine(String line) {
        String[] parts = line.split("\\.", 2);
        return parts[1];
    }

    public static NameFilter filterOddNumberedNames = line -> getNumberFromLine(line) % 2 != 0;

    public static NameFilter filterEvenNumberedNames = line -> getNumberFromLine(line) % 2 == 0;

    public static NameSort sortLowerToHigh = (String o1, String o2) -> getNameFromLine(o1).compareTo(getNameFromLine(o2));

    public static NameSort sortHighToLower = (String o1, String o2) -> getNameFromLine(o2).compareTo(getNameFromLine(o1));

    public NamesInvoker(File filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                names.add(line);
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public Collection<String> getFilteredNames(NameFilter filter) {
        AtomicInteger index = new AtomicInteger(1);
        return names.stream()
                .map(name -> index.getAndIncrement() + "." + name)
                .filter(filter::filter)
                .collect(Collectors.toList());
    }

    public Collection<String> getSortedNames(NameSort sort) {
        AtomicInteger index = new AtomicInteger(1);
        return names.stream()
                .map(name -> index.getAndIncrement() + "." + name)
                .map(String::toUpperCase)
                .sorted(sort)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        names.forEach(sj::add);
        return sj.toString();
    }
}
