package com.guna.interview.programs1;

import java.util.ArrayList;
import java.util.List;

public class CountDuplicatesInaString {

    public static int countDuplicates(String str) {
        List<Character> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (list.contains(ch)) {
                count += 1;
            } else {
                list.add(ch);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int count = CountDuplicatesInaString.countDuplicates("gunaaa");
        System.out.println(count);
    }
}
