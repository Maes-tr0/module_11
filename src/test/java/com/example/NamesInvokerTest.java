package com.example;

import com.example.task1_and_task2.NamesInvoker;
import static com.example.task1_and_task2.NamesInvoker.*;

import java.io.*;

public class NamesInvokerTest {
    public static void main(String[] args) {
        File filePath = new File("src/main/resources/java/com/example/task1_and_task2/names.txt");

        if (!filePath.exists()) {
            System.err.println("File not found: " + filePath.getPath());
            return;
        }

        NamesInvoker namesInvoker = new NamesInvoker(filePath);

        System.out.println("Original array of names:\n" + namesInvoker);

        System.out.println("\nAll odd-numbered names:\n" + namesInvoker.getFilteredNames(oddNumberedNames));
        System.out.println("\nAll even numbered names:\n" + namesInvoker.getFilteredNames(evenNumberedNames));

        System.out.println("\nSorted in descending order :\n" +namesInvoker.getSortedNames(lowToHigh));
        System.out.println("\nSorted in ascending order:\n" + namesInvoker.getSortedNames(highToLow));

        // Result:
        //  Original array of names:
        //  [Alexander, Maria, Dmitry, Elena, Ivan, Natalia, Sergey, Julia, Andrew, Victoria]
        //
        //  All odd-numbered names:
        //  [1.Alexander, 3.Dmitry, 5.Ivan, 7.Sergey, 9.Andrew]
        //
        //  All even numbered names:
        //  [2.Maria, 4.Elena, 6.Natalia, 8.Julia, 10.Victoria]
        //
        //  Sorted in descending order :
        //  [10.VICTORIA, 7.SERGEY, 6.NATALIA, 2.MARIA, 8.JULIA, 5.IVAN, 4.ELENA, 3.DMITRY, 9.ANDREW, 1.ALEXANDER]
        //
        //  Sorted in ascending order:
        //  [1.ALEXANDER, 9.ANDREW, 3.DMITRY, 4.ELENA, 5.IVAN, 8.JULIA, 2.MARIA, 6.NATALIA, 7.SERGEY, 10.VICTORIA]
        //
    }
}
