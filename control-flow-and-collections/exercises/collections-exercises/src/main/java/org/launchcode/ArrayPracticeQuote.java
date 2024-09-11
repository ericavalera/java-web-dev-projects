package org.launchcode;


import java.util.Arrays;

public class ArrayPracticeQuote {
    public static void main(String[] args) {
        String quote = "I would not, could not, in a box. I would not," +
                " could not with a fox. I will not eat them in a house." +
                " I will not eat them with a mouse.";
//        split by words
        String[] words = quote.split(" ");
        System.out.println(Arrays.toString(words));
//        split by sentences
        String[] sentences = quote.split("\\.");
        System.out.println(Arrays.toString(sentences));

    }

}

