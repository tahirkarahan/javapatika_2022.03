package com.patika.java101.conditionalstatment;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        /* Write down a user login code.
        If the password is wrong, ask the user whether he can reset his password, if the user wants to reset it,
        check that the new password must not be the same as the password he entered incorrectly and forgot,
        and if the passwords are the same, the screen "Could not create password, please enter another password."
        If there is no problem, write the program that says "Password created".
         */
        String userName, password, newPassword;
        int options, tryTimes;
        Scanner input = new Scanner(System.in);
        System.out.print("User Name:");
        userName = input.next();
        System.out.print("password:");
        password = input.next();
        if ((userName.equalsIgnoreCase("patika")) && (password.equals("java101"))) {
            System.out.println("The user longin successfully");
        } else if ((!userName.equalsIgnoreCase("patika")) && (password.equals("java101"))) {
            System.out.println("username is wrong!!!, please enter a valid user name!!!");
        } else if ((userName.equalsIgnoreCase("patika")) && (!password.equals("java101"))) {
            System.out.print("password is wrong!! you have no more chance," +
                    " Do you want to reset the password?\n1-YES\n2-NO\n ");
            options = input.nextInt();
            switch (options) {
                case 1:
                    System.out.print("Please enter new password:");
                    newPassword = input.next();
                    if (newPassword.equalsIgnoreCase("java101"))
                        System.out.println("new password should not be same as old password!!!");
                    else
                        System.out.println("The password rested successfully");
                    break;
                case 2:
                    System.out.println("you can not login");
                    break;
            }
        } else
            System.out.println(" This account is not exist, please create a new account");
    }
}

//            tryTimes = input.nextInt();
//            switch (tryTimes) {
//                case 1:password=input.next();
//                    if (password.equals("java101"))
//                        System.out.println("password is correct, user login successfully");
//                    else
//                        System.out.print("password is wrong!! you have 2 chances to enter password again,\npassword:");
//                    break;
//                case 2:password=input.next();
//                    if (password.equals("java101"))
//                        System.out.println("password is correct, user login successfully");
//                    else
//                        System.out.print("password is wrong!! you have 1 chances to enter password again,\npassword:");
//                   break;
//                case 3:password=input.next();
//                    if (password.equals("java101"))
//                        System.out.println("password is correct, user login successfully");
//                    else
//                        System.out.print("password is wrong!! you have no more chance," +
//                                " Do you want to reset the password?\n1-YES\n2-NO ");
//                    break;