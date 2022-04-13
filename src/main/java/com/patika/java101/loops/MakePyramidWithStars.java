package com.patika.java101.loops;

import java.util.Scanner;

public class MakePyramidWithStars {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("n= ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {    // i is number of rows
            //loop for print black space
            for (int j = 1; j <= (n - i); j++) {  // j is number of space
                System.out.print(" ");
            }
            //loop for print * sign
            for (int k = 1; k <= (2 * i) - 1; k++) {    // k is number of *
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
