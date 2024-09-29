package main.java.org.launchcode;

import org.launchcode.Flavor;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor flavor1, Flavor flavor2) {
        return flavor1.getName().compareTo(flavor2.getName());
    }
}
