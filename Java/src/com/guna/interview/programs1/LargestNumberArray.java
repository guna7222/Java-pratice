package com.guna.interview.programs1;

import java.util.Arrays;

public class LargestNumberArray {

    /*
    - find the largest number in a given array
    - given
    - input [90, 20, -130, 58, 163]
    - output = 163
 */
    public static int findLargestNumberIntheGivenArray(int[] array) {
        int number = 0;
        if (array.length == 1) {
            return array[0];
        } else {
            Arrays.sort(array);
             number = array[array.length -1];
            }
        return number;
    }

    public static void main(String[] args) {
        int n = LargestNumberArray.findLargestNumberIntheGivenArray(new int[] {90});
        System.out.println(n);
    }

}
