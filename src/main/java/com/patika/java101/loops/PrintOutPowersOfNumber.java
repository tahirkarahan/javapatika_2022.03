package com.patika.java101.loops;

import java.util.Scanner;

public class PrintOutPowersOfNumber {
    public static void main(String[] args) {
        /*We write a program that prints powers of 4 and 5 up to the number entered with Java loops
         * powers of 4           powers of 5
         * 4^0 = 1               5^0 = 1
         * 4^1 = 4               5^1 = 5
         * 4^2 = 16              5^2 = 25
         * 4^3 = 64              5^3 = 125
         * 4^4 = 256             5^4 = 625
         * 4^5 = 124             5^5 = 3125
         * .........                ..........
         **/
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a number:");
        n = input.nextInt();
        System.out.println("print out powers of 4: ");
        for (int i = 1; i < n; i *= 4) {
            System.out.print(i + ",");
        }

        System.out.println("\nprint out powers of 5: ");
        for (int i = 1; i < n; i *= 5) {
            System.out.print(i + ",");
        }
    }
}
