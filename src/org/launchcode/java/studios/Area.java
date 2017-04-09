package org.launchcode.java.studios;

import java.util.Scanner;

/**
 * Created by almig on 3/23/2017.
 */
public class Area {
    public static void main(String[] args) {
        Double radius;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What is the radius of the circle?");
        radius = in.nextDouble();

        if (radius < 0){
            do{
                System.out.println("The radius must be positive, try again:");
                radius = in.nextDouble();

            } while (radius < 0);
        }

        Double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is " + area);
    }
}
