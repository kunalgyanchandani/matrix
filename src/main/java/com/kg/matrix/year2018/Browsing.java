package com.kg.matrix.year2018;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.util.Scanner;
import java.util.stream.Stream;

public class Browsing {
    public static void main(String... args) throws IOException {
        String choiceString;
        Choices choice;
        Stream.of(Choices.values()).forEach(record -> System.out.print(record + "|"));

        do {
            System.out.println();
            choiceString = new Scanner(System.in).next();
            choice = Choices.valueOf(choiceString);
            switch (choice) {
                case money:
                    Desktop.getDesktop().browse(URI.create("https://www.thepennyhoarder.com/smart-money/simple-money-management-steps/"));
                    break;
                case unsorted:
                    Stream.of(unsorted).forEach(record ->
                    {
                        try {
                            Desktop.getDesktop().browse(URI.create(record));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
                    break;
                default:
                    Stream.of(Choices.values()).forEach(record -> System.out.print(record + "|"));
            }
        } while (choice != Choices.exit);
    }

    enum Choices {
        exit,
        money,
        unsorted
    }

    static String[] unsorted = {"https://twitter.com/java"
            ,
            "http://www.vogella.com/tutorials/DependencyInjection/article.html",
            "https://www.java-success.com/a-q10-top-50-core-java-interview-questions/", "https://www.java-success.com/category/tutorial/spring-tutorials/"
            , "https://www.java-success.com/spring-batch-industrial-strength-tutorial-part2/"
            , "https://www.java-success.com/category/tutorial/spring-tutorials/45-spring-batch-tutorial/"
            , "https://www.java-success.com/category/tutorial/core-java-tutorial/"
            , "https://www.java-success.com/13-spring-interview-questions-answers/?gclid=CjwKCAjwq57cBRBYEiwAdpx0vbUfJuUW-llkWMcXwWnMGe0ShgK-eC97K2p-j-UyMN2KGbqF7M7c8BoCG4EQAvD_BwE"
            , "https://www.guru99.com/pl-sql-interview-questions-answers.html"
            , "https://mindmajix.com/oracle-pl-sql-interview-questions"
            , "https://www.baeldung.com/java-lambda-exceptions", ""
            , "http://javadeveloperchoiceno1.blogspot.com/2015/04/java-15-vs-16-vs-17-vs-18.html"
            , "https://www.google.com/search?q=default+method+in+interface&oq=default+meth&aqs=chrome.1.69i57j0l5.4970j1j7&sourceid=chrome&ie=UTF-8"
            , "https://www.tutorialspoint.com/java8/java8_overview.htm"
            , "https://www.oracle.com/technetwork/java/javase/8-whats-new-2157071.html"
            , "https://www.baeldung.com/java-8-new-features", "https://www.google.com/search?q=java+8+features&oq=java+8+f&aqs=chrome.0.0j69i60j69i57j69i60l2j0.1603j1j7&sourceid=chrome&ie=UTF-8"


    };

}
