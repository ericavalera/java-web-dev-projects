package org.launchcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();

//        for bonus section
        String str = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will" +
                " not eat them in a house. I will not eat them" +
                " with a mouse.";
        String[] strWords = str.split(" ");
        ArrayList<String> arrListWords = new ArrayList<>(Arrays.asList(strWords));


//       words added to ArrayList
        words.add("cherry");
        words.add("grape");
        words.add("lemon");
        words.add("violet");
        words.add("rose");
        words.add("lime");
        words.add("red");
        words.add("grey");

//       nums added to ArrayList
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);

        //evenNums sum
        int total = 0;
        for (int integer : nums) {
            if (integer % 2 == 0) {
                total += integer;
            }
            ;
            System.out.println(total);
        }
        ;

//        for loop to print 5-letter words
        for (String word : words) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
//             input initialization for words selection from user
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number of word characters for your search: ");
//        int numSearch = input.nextInt();
//        input.close();
//
//        for (String wordSel : words) {
//            if (wordSel.length() == numSearch) {
//                System.out.println(wordSel);
//            }
//        }

//    bonus section
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number of word characters for your search: ");
        int numS = inp.nextInt();
        inp.close();

        for (String wordSelect : arrListWords) {
            if (wordSelect.length() == numS) {
                System.out.println(wordSelect);


            }
        }
    }
}

