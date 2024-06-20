package com.example;

import com.example.task1_and_task2.NamesInvoker;

import java.util.List;

public class NamesInvokerTest {
    public static void main(String[] args) {
        List<String> names = List.of(
                "Alexander",
                "Maria",
                "Dmitry",
                "Elena",
                "Ivan",
                "Natalia",
                "Sergey",
                "Julia",
                "Andrew",
                "Victoria"
        );

        NamesInvoker invoker = new NamesInvoker(names);

        System.out.println(invoker.getNames());

        System.out.println("\nNames on odd index: " + invoker.filterNameWithAnOddIndex());
        System.out.println("Names on Even index: " + invoker.filterNameWithAnEvenIndex());

        System.out.println("\nNames sorted by Descending Order: " + invoker.getUpperCaseNamesInDescendingOrder());
        System.out.println("Names sorted by Ascending Order: " + invoker.getUpperCaseNamesInAscendingOrder());
    }
}
