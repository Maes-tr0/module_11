package com.example;

import com.example.task1_and_task2.NamesInvoker;
import java.util.List;

public class NamesInvokerTest {
    public static void main(String[] args) {
        String filePath = "src/main/resources/java/com/example/task1_and_task2/names.txt";
        NamesInvoker invoker = new NamesInvoker(filePath);

        String namesString = invoker.getNamesString();
        System.out.println("Original string with names: " + namesString);

        List<String> sortedNamesList = invoker.getSortedNamesList();
        System.out.println("Sorted list names: " + sortedNamesList);
    }
}
