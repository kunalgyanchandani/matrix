package com.kg.matrix.theory.utilities;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class HtmlReadMatrix {
    public static void main(String... args) throws IOException {
        new Scanner(new URL("https://google.com").openStream(), StandardCharsets.UTF_8.toString()).useDelimiter("\\A").forEachRemaining(record ->
                System.out.println(record));
    }
}
