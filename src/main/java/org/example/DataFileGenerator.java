package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class DataFileGenerator {

    public static void generateDataFile(String fileName) {
        try {
            File file = new File(fileName);
            FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            //Kod do zapisania do pliku

            Random rand = new Random();
            for (int i = 0; i < 1000; i++) {
                int randNum = rand.nextInt(1000000) + 1;
                System.out.println(i + "=" + randNum);
                bufferedWriter.write(randNum + "\n");
            }
            bufferedWriter.close();
            //koniec kodu do zapisania w pliku
            writer.close();
            System.out.println("Plik został wygenerowany. Lokalizacja pliku to: " + System.getProperty("user.dir") + File.separator + fileName);
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas generowania pliku.");
            e.printStackTrace();

        }
    }

}
