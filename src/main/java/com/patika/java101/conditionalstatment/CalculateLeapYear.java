package com.patika.java101.conditionalstatment;

import java.util.Scanner;

public class CalculateLeapYear {
    public static void main(String[] args) {
        //A leap year is a year with 366 days instead of 365 in the Gregorian calendar.
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a year: ");
        year = input.nextInt();
        //1-way
        if (year > 0) {
            if (year % 4 == 0) {
                System.out.printf("%d is a leap year\n", year);
            } else {
                System.out.printf("%d is not a leap year\n", year);
            }
        } else {
            System.out.println("you entered wrong number!!");
        }

        //2-way
        boolean isArti = false;
        if (year % 4 == 0) {
            if (year % 400 == 0) {
                isArti = true;
            } else
                isArti = true;
        }

        if (isArti)
            System.out.println(year + " is a leap year !");
        else
            System.out.println(year + " is not a leap year !");
    }
}
