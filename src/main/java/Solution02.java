/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rishi Gadhia
 */
/*

Exercise 2 - Counting the Number of Characters
Create a program that prompts for an input string and displays output that shows the input string and
the number of characters the string contains.

Example Output
What is the input string? Homer
Homer has 5 characters.
Constraints
Be sure the output contains the original string.
Use a single output statement to construct the output.
Use a built-in function of the programming language to determine the length of the string.
 */

import java.util.*;


public class Solution02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Prompt user and scan the input
        System.out.print("What is the input string?");
        String str = in.nextLine();

        // use the built-in function to determine the length of the string
        int length = str.length();

        // Output the length of the string along with the string name

        System.out.printf("%s has %d characters.", str, length);







    }

}
