package com.example.task1_and_task2;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NamesInvoker {
    private final Collection<String> names = new ArrayList<>();
    private final AtomicInteger counter = new AtomicInteger();

    private static int getNumberFromLine(String line) {
        String[] parts = line.split("\\.", 2);
        return Integer.parseInt(parts[0]);
    }

    private static String getNameFromLine(String line) {
        String[] parts = line.split("\\.", 2);
        return parts[1];
    }

    public static Predicate<String> evenNumberedNames =
            line -> getNumberFromLine(line) % 2 == 0;

    public static Predicate<String> oddNumberedNames =
            line -> getNumberFromLine(line) % 2 != 0;

    public static Comparator<String> lowToHigh = (o1, o2) ->
            getNameFromLine(o1).compareTo(getNameFromLine(o2));

    public static Comparator<String> highToLow = (o1, o2) ->
            getNameFromLine(o2).compareTo(getNameFromLine(o1));

    public NamesInvoker(File filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                names.add(line);
            }
        } catch (IOException ex) {
            System.err.println("Error reading file: " + ex.getMessage());
        }
    }

    public Collection<String> getFilteredNames(Predicate<String> filter) {
        counter.set(1);
        return names.stream()
                .map(name -> counter.getAndIncrement() + "." + name)
                .filter(filter)
                .collect(Collectors.toList());
    }

    public Collection<String> getSortedNames(Comparator<String> comparator) {
        counter.set(1);
        return names.stream()
                .map(name -> counter.getAndIncrement() + "." + name)
                .map(String::toUpperCase)
                .sorted(comparator)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        names.forEach(sj::add);
        return sj.toString();
    }
}