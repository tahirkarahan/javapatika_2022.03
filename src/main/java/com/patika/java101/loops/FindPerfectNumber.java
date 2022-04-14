package com.patika.java101.loops;

import java.util.Scanner;

public class FindPerfectNumber {
    public static void main(String[] args) {
        /* A perfect number is a number whose positive integer factors (divisors without a remainder) are equal to itself,
        excluding the number itself.
         */
        int n;
        int sum = 0;
        int loop = 3;
        Scanner input = new Scanner(System.in);
        while (loop > 0) {
            System.out.print("Please enter a number:");
            n = input.nextInt();
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0)
                    sum += i;
            }
            if (sum == n) System.out.printf("%d is a perfect number\n", n);
            else System.out.printf("%d is not a perfect number\n", n);
            loop--;
        }
        if (loop == 0) System.out.println("it is over!");

    }
}
