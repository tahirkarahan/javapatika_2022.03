package com.patika.java101.methods;

import java.util.Scanner;

public class FindFibonacciSeriesByRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter Element number Fibonacci Series:");
        System.out.println(fibonacciSum(input.nextInt()));
    }

    public static int fibonacciSum(int n) {
        //f(n) = f(n-1) + f(n-2)
        if (n == 1 || n == 2){
            return 1;
        }
        return fibonacciSum(n - 1) + fibonacciSum(n - 2);
    }

}
