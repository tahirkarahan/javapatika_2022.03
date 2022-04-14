package com.patika.java101.loops;

import java.util.Scanner;

public class FindPrimeNumbers {
    public static void main(String[] args) {
        System.out.print("Please enter a number:");
        Scanner input = new Scanner(System.in);
        int y = input.nextInt();
//        for (int x = 2; x < y; x++) {
//            if (x / 1 == x && x % 2 != 0 && x % 3 != 0 && x % 5 != 0) {
//                System.out.print(x + " ");
//            }
//        }

        boolean isPrime ;
        for (int i = 2; i < y; i++) {
           isPrime =true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.print(" " + i);
        }
    }
}

