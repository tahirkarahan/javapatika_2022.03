package com.patika.java101.methods;

import java.util.Scanner;

public class FindPrimeNumber {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a number: ");
        num = input.nextInt();
        isPrimeNumber(num);

    }

    private static boolean isPrimeNumber(int num, int i) {

        if (num == 2) {
            System.out.print("2 is a prime number!");
            return true;
        }
        if (num % i == 0) {
            System.out.println(num + " is not a prime number!");
            return false;
        }
        if (i * i > num) {
            System.out.print(num + " is a prime number !");
            return true;
        }

        return isPrimeNumber(num, i + 1);
    }

    public static void isPrimeNumber(int num) {
        isPrimeNumber(num, 2);
    }
}
