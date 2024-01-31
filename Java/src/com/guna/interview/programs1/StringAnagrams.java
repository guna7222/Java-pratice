package com.guna.interview.programs1;

import java.util.Arrays;

/**
 * Write a java program to check two strings are anagrams or not using arrays comparison
 * two strings are anagrams if they contain same characters but in different order
 */
public class StringAnagrams {

    public static String checkStringAnagrams(String str1, String str2) {
        if (str1.length() == str2.length()) {
            // converting string to char array
            char[] charArray = str1.toCharArray();
            Arrays.sort(charArray);

            // converting string to char array
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray2);

            if (Arrays.equals(charArray, charArray2)) {
                return "String Anagram";
            }
        }
            return "not a anagram";
    }

    public static void main(String[] args) {
        String output = StringAnagrams.checkStringAnagrams("hello", "ohell");
        System.out.println(output);
    }
    }

