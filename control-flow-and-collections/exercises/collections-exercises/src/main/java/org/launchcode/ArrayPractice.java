package org.launchcode;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] arrayNums = {1, 1, 2, 3, 5, 8};
        for (int i : arrayNums) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
