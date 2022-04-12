package com.patika.java101.loops;

import java.util.Scanner;

public class MakePyramidWithStars {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("n= ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            //loop for print black space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            //loop for print * sign
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
