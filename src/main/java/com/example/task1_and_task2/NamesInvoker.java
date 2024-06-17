package com.example.task1_and_task2;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class NamesInvoker {
    private final List<String> names;

    public NamesInvoker(String filePath) {
        this.names = readNamesFromFile(filePath);
    }

    private List<String> readNamesFromFile(String filePath) {
        try {
            return Files.readAllLines(Paths.get(filePath));
        } catch (IOException ex) {
            System.err.println("Error reading file: " + ex.getMessage());
            return Collections.emptyList();
        }
    }

    public String getNamesString() {
        return String.join(", ", names);
    }

    public List<String> getSortedNamesList() {
        return names.stream()
                .sorted()
                .toList();
    }

    @Override
    public String toString() {
        return getNamesString();
    }
}