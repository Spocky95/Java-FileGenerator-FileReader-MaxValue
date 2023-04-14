package org.example;

public class FindMaxValue {

    public int findMaxValue(int[] array){
        int maxValue = array[0];
        System.out.println("Ilość wierszy: " + array.length);
        for(int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

}