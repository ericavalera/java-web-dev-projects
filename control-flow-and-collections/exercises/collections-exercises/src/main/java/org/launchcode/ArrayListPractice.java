package org.launchcode;
import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
       ArrayList<Integer> nums = new ArrayList<>();
       ArrayList<String> words = new ArrayList<>();

       words.add("cherry");
       words.add("grape");
       words.add("lemony");
       words.add("violet");

        //evenNums sum
        for(int integer : nums){
            int total = 0;
            if(integer % 2 == 0){
                total += integer;
            }
            System.out.println(total);
                }
//        for loop to print 5-letter words
        for(String word: words){
            if(word.length() == 5){
                System.out.println(word);
            }


            }
        }

    }




