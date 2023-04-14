package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataFileGenerator.generateDataFile("plik.txt");

        List<Integer> list = DataFileReader.readDataFile("plik.txt");
        int[] array = list.stream().mapToInt(i -> i).toArray();

        FindMaxValue findMaxValue = new FindMaxValue();
        int maxValue = findMaxValue.findMaxValue(array);
        System.out.println("Max value is: " + maxValue);

    }
}