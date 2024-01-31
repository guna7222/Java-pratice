package com.guna.interview.programs1;

/**
 * Reverse words in a String
 * Input:- welcome to the java world
 * output:- world java the to welcome
 */
public class ReverseWordsInAString {

    public static String reverseWords(String words) {
        String[] array = words.split(" ");
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = array.length - 1; i >= 0; i--) {
            stringBuffer.append(array[i] + " ");
        }
        return stringBuffer.toString();

    }

    public static void main(String[] args) {
        String s = ReverseWordsInAString.reverseWords("welcome to the java world");
        System.out.println(s);


    }
}
