package com.patika.java101;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        System.out.print("Please enter month number:");
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("It is Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It is Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("It is Autumn");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("It is Winter");
                break;
            default:
                System.out.println("Invalid number");

        }
    }
}
