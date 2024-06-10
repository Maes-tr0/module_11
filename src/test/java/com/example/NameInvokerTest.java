package com.example;

import com.example.task1_and_task2.NamesInvoker;
import static com.example.task1_and_task2.NamesInvoker.*;

import java.io.*;

public class NameInvokerTest {
    public static void main(String[] args) {
        File filePath = new File("src/main/resources/java/com/example/task1_and_task2/names.txt");

        if (!filePath.exists()) {
            System.err.println("File not found: " + filePath.getPath());
            return;
        }

        NamesInvoker namesInvoker = new NamesInvoker(filePath);

        System.out.println("Original array of names:\n" + namesInvoker);

        System.out.println("\nAll odd-numbered names:\n" + namesInvoker.getFilteredNames(filterOddNumberedNames));
        System.out.println("\nAll even numbered names:\n" + namesInvoker.getFilteredNames(filterEvenNumberedNames));

        System.out.println("\nSorted in descending order :\n" +namesInvoker.getSortedNames(sortHighToLower));
        System.out.println("\nSorted in ascending order:\n" + namesInvoker.getSortedNames(sortLowerToHigh));
    }
}
