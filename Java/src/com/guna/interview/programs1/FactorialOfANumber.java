package com.guna.interview.programs1;

import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        int fact = 1;
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Factorial of 0 is 1");
        } else if (number == 1) {
            System.out.println("Factorial of 1 is 1");
        } else {
            for (int i = number; i >= 1; i--) {
                fact = fact * i;
            }
            System.out.println(fact);
        }

    }
}
