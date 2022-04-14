package com.patika.java101.loops;

import java.util.Scanner;

public class MakeInvertedPyramid {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("please enter row number:"); // n= row number
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n- (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = (2 * n - 2 * i - 1); k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
