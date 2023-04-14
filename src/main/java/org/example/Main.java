package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Generuje plik .txt z liczbami losowymi
        DataFileGenerator.generateDataFile("plik.txt");

        //Czyta plik .txt i jego zawarość dodaje do listy
        List<Integer> list = DataFileReader.readDataFile("plik.txt");
        int[] array = list.stream().mapToInt(i -> i).toArray();

        //Szuka najwyższej wartości na liście, przypisuje ją do zmiennej i wyświetla.
        FindMaxValue findMaxValue = new FindMaxValue();
        int maxValue = findMaxValue.findMaxValue(array);
        System.out.println("Max value is: " + maxValue);

    }
}