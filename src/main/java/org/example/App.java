/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Reese Stowell
 */
package org.example;
import java.util.Scanner;
import java.util.Arrays;

public class App {
    static boolean isAnagram(char[] input1, char[] input2)
    {
            int length1, length2;

            length1 = input1.length;
            length2 = input2.length;

            if (length1 != length2)
            {
                return false;
            }

            Arrays.sort(input1);
            Arrays.sort(input2);

            for (int i = 0; i < length1; i++)
            {
                if (input1[i] != input2[i])
                {
                    return false;
                }
            }
        return true;
    }
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        String word1, word2;

        System.out.print("Enter two strings and I'll tell you if they are anagrams:\nEnter the first string: ");
        word1 = user_input.nextLine();
        System.out.print("Enter the second string: ");
        word2 = user_input.nextLine();

        char[] word1_array = new char[word1.length()];
        char[] word2_array = new char[word2.length()];

        for (int i = 0; i < word1.length(); i++)
        {
            word1_array[i] = word1.charAt(i);
        }
        for (int i = 0; i < word2.length(); i++)
        {
            word2_array[i] = word2.charAt(i);
        }

        if (isAnagram(word1_array, word2_array))
        {
            System.out.println( word1 + " and " + word2 + " are anagrams");
        }
        else
        {
            System.out.println( word1 + " and " + word2 + " are not anagrams");
        }

    }
}
