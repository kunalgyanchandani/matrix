package com.kg.matrix;

import sun.tools.jar.CommandLine;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommandLineExp {
    public static void main(String... args) throws IOException, InterruptedException {

        Runtime.getRuntime().traceMethodCalls(true);
        Runtime.getRuntime().traceInstructions(true);
        Runtime.getRuntime().exec("tasklist");

        ArrayList t = new ArrayList();
        new Scanner(
                Runtime.getRuntime().exec("tasklist").getInputStream()
        ).useDelimiter("\n").forEachRemaining(record -> t.add(record));

        t.stream().limit(2).skip(1).forEach(record -> System.out.println(record.toString().split("\t")[0]));

    }
}
