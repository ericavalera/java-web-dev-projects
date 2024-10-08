package org.launchcode;
import java.util.Scanner;
public class AliceSearch {
    public static void main(String[]args){
        String sentences = "Alice was beginning to get very tired of sitting by her sister" +
                " on the bank, and having nothing to do; once or twice she had peeped into the" +
                " book her sister was reading, but it had no pictures or conversations in it, 'and " +
                "what is the use of  a book', thought Alice 'without pictures or conversation?' ";

        Scanner input= new Scanner(System.in);
        System.out.println("What word are you searching for?: ");
        String word = input.next();
        String wordUpper = word.toUpperCase();
        String sentencesUpper = sentences.toUpperCase();

        if (sentencesUpper.contains(wordUpper)) {
            System.out.println(word + " was found in the Alice in Wonderland text!");
        } else {
            System.out.println(word + " was not found in the Alice in Wonderland text.");
        }
//        Bonus section
        int index= sentencesUpper.indexOf(wordUpper);
        int length= word.length();
        System.out.println("Your search term first appears at index " + index + ".Your term is " + length + " characters long.");
        String modifiedSentence = sentences.replace(word, "");
        System.out.println(modifiedSentence);

    }
}


