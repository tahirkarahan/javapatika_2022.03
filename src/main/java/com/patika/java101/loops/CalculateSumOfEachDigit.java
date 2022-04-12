package com.patika.java101.loops;

import java.util.Scanner;

public class CalculateSumOfEachDigit {
    public static void main(String[] args) {
        /* Calculates the sum of the digits of a number.
        * eg:  6455= 6 + 4 + 5 + 5 = 20
        * */
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a number:");
        number = input.nextInt();
        int digitValue=1;
        int result = 0;
        //Finding count of Digits
        while (number != 0) {
            digitValue = number % 10;
            System.out.println(digitValue);
            result += digitValue;
            number /= 10;
        }
        System.out.print(result);

    }
}
