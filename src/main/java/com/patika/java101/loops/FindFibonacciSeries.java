package com.patika.java101.loops;

import java.util.Scanner;

public class FindFibonacciSeries {
    public static void main(String[] args) {
        /* What is the Fibonacci sequence?
        The Fibonacci sequence is a set of numbers that starts with a one or a zero, followed by a one, and proceeds
        based on the rule that each number (called a Fibonacci number) is equal to the sum of the preceding two numbers.
        eg: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... The next
         */
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter Element number Fibonacci Series:");
        n = input.nextInt(); // n is element number of Fibonacci Series
        int n1 = 0, n2 = 1, sum;
        System.out.print(n1 + " " + n2);//printing 0 and 1

        for (int i = 2; i <= n; i++)//loop starts from 2 because 0 and 1 are already printed
        {
            sum = n1 + n2;
            System.out.print(" " + sum);
            n1 = n2;
            n2 = sum;
        }
        System.out.println();
    }
}
