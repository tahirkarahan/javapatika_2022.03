package com.patika.java101.loops;

import java.util.Scanner;

public class ArmstrongNumberFinder {
    public static void main(String[] args) {
        /* What is Armstrong number?
        An n-digit number is called an Armstrong number if the sum of the nth powers
         of the digits is equal to the number itself.*/
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a number:");
        number = input.nextInt();
        int tempNumber = number;
        int digitCounts = 0;
        int digitValue;
        int digitPower = 1;
        int result = 0;
        //Finding count of Digits
        while (tempNumber != 0) {
            tempNumber /= 10;
            digitCounts++;
        }
        System.out.println(digitCounts);
        System.out.println("*************");
        //Finding the last digit of a number
        tempNumber = number;
        while (tempNumber != 0) {
            digitValue = tempNumber % 10;
            //calculate sum of the nth powers of each digits
            //digitPower=1;
//            for (int i = 1; i <= digitCounts; i++) {
//                digitPower *=digitValue;//(digitPower*digitValue)
//            }
            digitPower = (int) Math.pow(digitValue, digitCounts);
            System.out.println(digitValue);
            System.out.println(digitPower);
            result += digitPower;
            tempNumber /= 10;
        }
        System.out.println("---------");
        System.out.println(result);
        if (result == number) {
            System.out.println(String.format("%d is an Armstrong number", number));
        } else
            System.out.printf("%d is not an Armstrong number", number);

    }
}
