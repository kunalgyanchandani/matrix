package com.kg.matrix.year2018;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Dictionary {
    public static void main(String... args) throws IOException {
        String choiceString;
        Choices choice;
        Stream.of(Choices.values()).forEach(record -> System.out.print(record + "|"));

        do {

            System.out.println();
            choiceString = new Scanner(System.in).next();
            choice = Choices.valueOf(choiceString);
            switch (choice) {
                case shindig:
                    launch(new String[]{
                            "https://www.google.com/search?q=shindig&oq=shindig&aqs=chrome..69i57&sourceid=chrome&ie=UTF-8",
                            "https://www.facebook.com/events/270994466957807"
                    });
                    break;
                default:
                    Stream.of(Choices.values()).forEach(record -> System.out.print(record + "|"));
            }
        } while (choice != Choices.exit);
    }

    private static void launch(String[] s) {
        Stream.of(s).forEach(record ->
        {
            try {
                Desktop.getDesktop().browse(URI.create(record));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }

    enum Choices {
        exit,
        shindig
    }
}
