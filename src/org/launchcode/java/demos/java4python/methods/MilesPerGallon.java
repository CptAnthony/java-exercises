package org.launchcode.java.demos.java4python.methods;

import java.util.Scanner;

/**
 * Created by almig on 3/23/2017.
 */
public class MilesPerGallon {
    public static void main(String[] args) {
        Double miles;
        Double gallons;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        miles = in.nextDouble();

        in = new Scanner(System.in);
        System.out.println("How many gallons have you used?");
        gallons = in.nextDouble();

        Double mpg = miles / gallons;
        System.out.println("You get " + mpg + " miles to the gallon!");
    }

}
