package com.kg.matrix.theory.database;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sprint implements Serializable {

    public static void main(String... args) throws IOException, ClassNotFoundException {

        Object current = new Sprint();
        String Database = "./src/main/resources/db." + current.getClass().getSimpleName();
        if (current.getClass().getResource(Database) == null)
            new File(Database).createNewFile();

        //new ObjectOutputStream(new FileOutputStream(Database)).writeObject(new Sprint());

        Sprint database = (Sprint) new ObjectInputStream(new FileInputStream(Database)).readObject();
        database.run();
        new ObjectOutputStream(new FileOutputStream(Database)).writeObject(database);
    }

    private Map<String, String> dataset = new HashMap<>();

    public void run(String... args) {
        do {
            System.out.print(":");
            String userInput = new Scanner(System.in).useDelimiter("\n").nextLine();
            char action = userInput.charAt(0);
            userInput = userInput.substring(1).trim();

            switch (action) {
                case '+':
                    dataset.put(userInput, new Scanner(System.in).useDelimiter("\n").nextLine());
                    break;
                case '-':
                    dataset.remove(userInput);
                    break;
                case '=':
                    System.out.println(dataset.get(userInput));
                    break;
                case '*':
                    System.out.println(dataset);
                    break;
                case '!':
                    return;
                default:
                    System.out.println("BadChoice");

            }
        } while (true);
    }
}
