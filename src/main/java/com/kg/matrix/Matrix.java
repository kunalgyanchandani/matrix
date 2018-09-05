package com.kg.matrix;

import java.util.Scanner;

public class Matrix {
    public static void main(String... args) {
        System.out.println("Veritas");

        String choiceString;
        Choices choice;
        do {
            choiceString = new Scanner(System.in).next();
            choice = Choices.valueOf(choiceString);
            switch (choice) {
                case happy:
                    System.out.println("Happy");
                    break;
                default:
                    break;
            }
        } while (!choice.toString().equals("exit"));
    }

    enum Choices {
        happy, exit
    }
}
