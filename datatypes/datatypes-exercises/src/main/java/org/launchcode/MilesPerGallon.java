package org.launchcode;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the miles you have driven: ");
        Double miles = input.nextDouble();
        System.out.println("Enter the amount of gas used: ");
        Double gas = input.nextDouble();
        System.out.println( miles/gas + " miles-per-gallon");

    }
}
