package org.launchcode;
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of the rectangle: ");
        Integer length = input.nextInt();
        System.out.println("Enter width of the rectangle: ");
        Integer width= input.nextInt();
        System.out.print("The area the rectangle is " + width * length);
    }
}
