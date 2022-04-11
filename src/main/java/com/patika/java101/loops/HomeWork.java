package com.patika.java101.loops;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        int number = 0, count = 0;
        boolean run = true;
        Scanner input = new Scanner(System.in);
        while (run) {
            System.out.print("please enter a number:");
            number = input.nextInt();
            if (number >= 10) {
                System.out.print("please enter number again:\n");
                if (number % 4 == 0) {
                    count++;
                }
            } else {
                System.out.println(String.format("%d is one digit number.", number));
                run = false;
            }
        }
        System.out.println("counts of even numbers and counts of numbers that can be divided to 4 are: " + count);
    }
}
