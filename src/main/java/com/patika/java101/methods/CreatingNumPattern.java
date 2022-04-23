package com.patika.java101.methods;

import java.util.Scanner;

public class CreatingNumPattern {
    /*-Write a "Recursive" method in Java language without looping which obeys the following rule based
    on the n value received from the user.
    * Rule : Subtract 5 from the entered number up to where the entered number is 0 or negative. Print
    the last value to the screen during each subtraction. After the number is negative or 0,
    add 5 again. Again, print the last value of the number on the screen in each addition operation.
     */
    public static void main(String[] args) {
        int num;
        Scanner input=new Scanner(System.in);
        System.out.print("please enter a number: ");
        num=input.nextInt();
        System.out.print("The result : ");
        numPattern(num, num, false);
    }
    public static void numPattern(int num, int temp, boolean status) {
        System.out.print(temp + " ");
        if (temp <= 0) {
            status = true;
        }

        temp = status ? temp + 5 : temp - 5;
        if (temp <= num) {
            numPattern(num, temp, status);
        }
    }
}
