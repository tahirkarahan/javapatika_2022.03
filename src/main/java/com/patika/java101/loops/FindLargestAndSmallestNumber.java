package com.patika.java101.loops;

import java.util.Scanner;

public class FindLargestAndSmallestNumber {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        int num ;
        System.out.print("How many number you wanna enter:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". number: ");
            num = input.nextInt();
//            if (i == 1) {
//                min = num;
//                max = num;
//            }
            if (num < min) min = num; //comparing each time entered number with smallest one
            if (num > max) max = num; //comparing each time entered number with largest one
        }
        System.out.println("The largest number is:" + max);
        System.out.println("The smallest number is : " + min);
    }
}
