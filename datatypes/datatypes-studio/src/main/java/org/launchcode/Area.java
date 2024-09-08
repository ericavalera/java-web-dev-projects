package org.launchcode;
import java.util.Scanner;
public class Area {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        double radius;
        do {
            System.out.println("Enter a radius: ");
            if (!input.hasNextDouble()) {
                radius = 0;
                input.next(); //clears the scanner
                System.out.println("Radius must be a number.");
            } else {
                radius = input.nextDouble();
                if (radius <= 0) {
                    System.out.println("Radius must be a positive number.");
                }
            }
        } while (radius <= 0);
        double area= Circle.getArea(radius);
        System.out.println("The area of a circle of " + radius + " is " + area + "!");
    }

}
