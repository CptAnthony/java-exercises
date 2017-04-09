package org.launchcode.java.demos.java4python.methods;

import java.util.Scanner;

/**
 * Created by almig on 3/23/2017.
 */
public class AliceSearch {
    public static void main(String[] args) {
        String poem = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        String search;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What word would you like to search for?");
        search = in.next();

        String l_poem = poem.toLowerCase();
        String l_search = search.toLowerCase();

        boolean searchreturn = l_poem.contains(l_search);
        System.out.println(searchreturn);
    }

}
