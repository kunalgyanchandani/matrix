package com.kg.matrix.year2018;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.util.Scanner;
import java.util.stream.Stream;

public class Interview {
    public static void main(String... args) throws IOException {
        String choiceString;
        Choices choice;
        Stream.of(Choices.values()).forEach(record -> System.out.print(record + "|"));

        do {

            System.out.println();
            choiceString = new Scanner(System.in).next();
            choice = Choices.valueOf(choiceString);
            switch (choice) {
                case heapMemory:
                    System.out.println("EdenSpace|SurvivorSpace|TenuredGeneration");
                    Desktop.getDesktop().browse(URI.create("https://www.quora.com/How-is-browsing-memory-pool-divided"));
                    break;
                case nonHeapMemory:
                    System.out.println("Permanent Generation|Code Cache");
                    Desktop.getDesktop().browse(URI.create("https://www.quora.com/How-is-browsing-memory-pool-divided"));
                    break;
                case stackvsHeap:
                    Desktop.getDesktop().browse(URI.create("https://dzone.com/articles/stack-vs-heap-understanding-browsing-memory-allocation"));
                default:
                    Stream.of(Choices.values()).forEach(record -> System.out.print(record + "|"));
            }
        } while (choice != Choices.exit);
    }

    enum Choices {
        exit,
        heapMemory, nonHeapMemory, stackvsHeap,
    }
}
