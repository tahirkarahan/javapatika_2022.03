package com.patika.java101.loops;

import java.util.Scanner;

public class MakeInvertedPyramid {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("please enter row number:"); // n= row number
        n = input.nextInt();
        // loop for row
        for (int i = 0; i < n; i++) {
            //loop for space (" ")
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            // loop for ("*")
            for (int k = 0; k < (2 * n - 2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
