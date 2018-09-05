package com.kg.matrix.home;

import java.awt.*;
import java.io.*;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Browsing implements Serializable {

    public static void main(String... args) throws IOException, ClassNotFoundException {

        Object current = new Browsing();
        String Database = "./src/main/resources/db." + current.getClass().getSimpleName();
        if (new File(Database).exists() ==false) {
            new File(Database).createNewFile();
            new ObjectOutputStream(new FileOutputStream(Database)).writeObject(new Browsing());
        }

        Browsing database = (Browsing) new ObjectInputStream(new FileInputStream(Database)).readObject();
        database.run();
        new ObjectOutputStream(new FileOutputStream(Database)).writeObject(database);
    }

    private Map<String, String> dataset = new HashMap<>();

    public void run(String... args) throws IOException {
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
                    Desktop.getDesktop().browse(URI.create(dataset.get(userInput)));
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
