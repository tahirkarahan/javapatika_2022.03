package com.patika.java101.loops;

import java.util.Scanner;

public class CombinationsCalculating {
    public static void main(String[] args) {
        /* The number of different groups with r elements to be formed with the elements
           of a set with n elements is called the r combination of n. The r combination of n is denoted as C(n,r).
         * Write a program that calculates combinations in Java.
         * Combination formula: C(n,r) = n! / (r! * (n-r)!)
         */
        int n, r;
        int factorial1 = 1, factorial2 = 1, factorial3 = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("n= ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            factorial1 *= i;
        }
        System.out.print("r= ");
        r = input.nextInt();
        for (int t = 1; t <= r; t++) {
            factorial2 *= t;
        }

        for (int t = 1; t <= (n - r); t++) {
            factorial3 *= t;
        }
        System.out.println(String.format("%d!= %d", n, factorial1));
        System.out.println(String.format("%d!= %d", r, factorial2));
        System.out.println(String.format("(%d-%d)!= %d", n, r, factorial3));
        double combinationValve = factorial1 / (factorial2 * factorial3);
        System.out.printf("C(n,r)= %d! / (%d! * (%d-%d)!)", n, r, n, r);
        System.out.printf("=%.2f", combinationValve);

    }

}
