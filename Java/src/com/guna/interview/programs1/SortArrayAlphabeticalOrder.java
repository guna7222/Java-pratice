package com.guna.interview.programs1;

import java.util.Arrays;

/*
sort array in alphabetical order
 */
public class SortArrayAlphabeticalOrder {
    public static void main(String[] args) {
        String str[] = new String[5];
        str[0] = "ssg";
        str[1] = "guna";
        str[2] = "ajay";
        str[3] = "santhu";
        str[4] = "thrilok";

        Arrays.sort(str);

        System.out.println("sorted array");
        for(String s : str){
            System.out.println(s);
        }

    }
}
