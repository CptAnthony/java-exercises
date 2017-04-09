package org.launchcode.java.exercises;

import java.util.stream.IntStream;

import static java.lang.System.in;

/**
 * Created by almig on 3/28/2017.
 */
public class ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numList = {1,2,3,4,5,6,7,8,9,10}
    }

    public static void sumEvens() {

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
    }

    public static void sumEvens; (ArrayList testList){

        ArrayList<Integer> evenList = new ArrayList<>();
            for (int i : testList) {
                if ((i % 2) == 0) {
                    evenList.add(i);
                }
                int sumEven = IntStream.of(evenList).sum();
                System.out.println("The sum is " + sumEven);
            }
        }
    }
}