package org.launchcode;

import main.java.org.launchcode.ConeComparator;
import main.java.org.launchcode.FlavorComparator;

import java.util.ArrayList;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<org.launchcode.Cone> cones = menu.getCones();
        Comparator<Flavor> comparator = new FlavorComparator();
        Comparator<Cone> comparator1 = new ConeComparator();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.

        flavors.sort(comparator);

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        cones.sort(comparator1);

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

        for(Flavor flavor : flavors){
            System.out.println(flavor.getName());
        }
        for(Cone cone : cones){
            System.out.println(cone.getName() + " $"+ cone.getCost());
        }





    }
}