package org.launchcode;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] arrayNums = {1, 1, 2, 3, 5, 8};

        String quote = "I would not, could not, in a box. I would not," +
                " could not with a fox. I will not eat them in a house." +
                " I will not eat them with a mouse.";

        for (int i : arrayNums) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        //split by words
        String [] words = quote.split(" ");
        System.out.println(Arrays.toString(words));
        //split by sentences
        String[] sentences = quote.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}
