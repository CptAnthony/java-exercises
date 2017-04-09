package org.launchcode.java.demos.java4python;

/**
 * From "Java for Python Programmers"
 */

import java.util.Scanner;

/**
 - Original Code -
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Java");
    }
}

 - New Code takes name input and responds with Hello, name -

*/

public class Hello {
    public static void main(String[] args) {
        String name;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What is your name?");
        name = in.next();

        System.out.println("Hello " + name + "!");

    }
}
