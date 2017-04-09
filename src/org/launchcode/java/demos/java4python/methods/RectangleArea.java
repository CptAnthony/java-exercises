package org.launchcode.java.demos.java4python.methods;

import java.util.Scanner;

/**
 * Created by almig on 3/23/2017.
 */
public class RectangleArea {
    public static void main(String[] args) {
        Double length;
        Double height;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        length = in.nextDouble();

        in = new Scanner(System.in);
        System.out.println("And the height?");
        height = in.nextDouble();

        Double area = length * height;
        System.out.println("The area of the rectangle is " + area);
    }

}
