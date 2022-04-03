package com.patika.java101;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ATMDemo {
    public static void main(String[] args) {
        int pinNumber = 262728;
        double balance = 8000;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your pinNumber:");
        String password = input.nextLine();
        System.out.println(password);
        if (StringUtils.isNumeric(password)) {
            if (pinNumber == Integer.parseInt(password)) {
                System.out.println("please select the menu(Tfansfer,Withdraw,Payment)");
                String menu = input.nextLine();
                if (menu.equalsIgnoreCase("Withdraw")) {
                    System.out.println("Please enter withdraw amount");
                    int amount = input.nextInt();

                    if (menu.equalsIgnoreCase("Withdraw") && amount <= balance) {
                        System.out.println("Preparing your cash,please check your money");
                        System.out.printf("Your current balance is %f\n", balance - amount);

                    } else {
                        System.out.println("Withdraw amount can not greater than balance");
                    }
                } else
                    System.out.println("error");
            } else {
                System.out.println("Wrong password,please try again");
            }

        } else {
            System.out.println("Please enter valid 6 digit numbers");
        }

    }
}
