package com.guna.interview.programs1;

import java.util.HashSet;
import java.util.Set;


/**
 * remove duplicates from String
 * input :- sandeep
 * output :- sandep
 */
public class RemoveDuplicatesFromString {

    public static String removeDuplicatesFromString(String name) {
        Set<Character> hashSet = new HashSet<>();
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < name.length(); i++) {
            char character = name.charAt(i);
            if (!hashSet.contains(character)) {
                hashSet.add(character);
                stringBuffer.append(character);
            }
        }

        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        String output = RemoveDuplicatesFromString.removeDuplicatesFromString("sssssandeepppp");
        System.out.println(output);

    }
}
