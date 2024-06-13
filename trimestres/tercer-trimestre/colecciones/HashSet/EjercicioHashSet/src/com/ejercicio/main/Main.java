package com.ejercicio.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> lineSet = new HashSet<>();

        try {
            FileReader fileReader = new FileReader("archivo.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Agrega la línea al HashSet, que garantiza que solo se almacenen líneas únicas
                lineSet.add(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Imprime las líneas únicas almacenadas en el HashSet
        for (String uniqueLine : lineSet) {
            System.out.println(uniqueLine);
        }
    }
}
