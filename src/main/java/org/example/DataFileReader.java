package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataFileReader {

    public static List<Integer> readDataFile(String fileName) {
        List<Integer> list = new ArrayList<Integer>();
        try {
            File file = new File(fileName);
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                int number = Integer.parseInt(line.trim());
                list.add(number);
            }
            System.out.println("Plik został odczytany.");

            reader.close();
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas odczytu pliku.");
            e.printStackTrace();
        }

        return list;
    }
}
