package com.patika.java101.loops;

import java.util.Scanner;

public class ATMService {
    public static void main(String[] args) {
        String userName, password;
        int balance = 5000;
        int chance = 3;
        int selection;
        System.out.println("Welcome to use QNB Bank ATM!!!");
        Scanner input = new Scanner(System.in);
        while (chance > 0) {
            System.out.print("Please enter user name: ");
            userName = input.next();
            System.out.print("please enter your password:");
            password = input.next();
            if (userName.equalsIgnoreCase("Alma") && password.equalsIgnoreCase("java101")) {
                do {
                    System.out.print("1-Deposit Money\n2-withdraw money\n3-balance inquiry\n4-exit\n");
                    System.out.print("Please select the Menu:");
                    selection = input.nextInt();
                    switch (selection) {
                        case 1 -> {
                            System.out.print("please enter deposit amount:");
                            int depositAmount = input.nextInt();
                            balance += depositAmount;
                            System.out.print("The money has deposited successfully!\nYour new balance is:" + balance + "\n");
                        }
                        case 2 -> {
                            System.out.print("Please enter withdraw amount:");
                            int withdrawAmount = input.nextInt();
                            if (withdrawAmount <= balance) {
                                balance -= withdrawAmount;
                                System.out.print("Your new balance is:" + balance + "\n");
                            } else
                                System.out.println("insufficient balance!!!");
                        }
                        case 3 -> System.out.print("your balance is:" + balance+"\n");
                    }
                } while (selection != 4);
                System.out.println("See you again, Good-Bye!!");
                break;
            } else {
                chance--;
                if (chance == 0) {
                    System.out.println("Your account has been blocked, please contact the bank quickly");
                } else {
                    System.out.println("Sorry!! you entered wrong user name or password,please try again");
                    System.out.println(String.format("you have %d chance", chance));
                }
            }
        }

    }
}
