package com.patika.java101.loops;

import java.util.Scanner;

public class CalculateOfSum {
    public static void main(String[] args) {
        int a, sum = 0, count = 0;
        double average=0;
        Scanner input = new Scanner(System.in);
        System.out.print("a=");
        a = input.nextInt();
        for (int i = 1; i <= a; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.print(i+",");
                sum += i;
                count++;
                average = sum / count;
            }
        }
        System.out.println();
        System.out.println(String.format("there are %d numbers that can be divided by 3 and 4 range into %d", count, a));
        System.out.print("sum="+sum);
        System.out.printf(" \naverage is: %d / %d = %.2f",sum,count,average);

    }
}
