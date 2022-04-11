package com.patika.java101.loops;

import java.util.Scanner;

public class cCalculateExponentialOfNumbers {
    public static void main(String[] args) {
        /* m^n
         * eg: 5^3 = 5*5*5
         */
        int m, n;
        int total = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("m= ");
        m = input.nextInt();
        System.out.print("n= ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            total *= m;
        }
        System.out.printf("%d ^ %d = %d", m, n, total);
    }
}
