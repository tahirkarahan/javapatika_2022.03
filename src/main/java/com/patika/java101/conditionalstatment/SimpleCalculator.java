package com.patika.java101.conditionalstatment;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        int n1, n2, selection;
        Scanner input = new Scanner(System.in);
        System.out.print("n1= ");
        n1 = input.nextInt();
        System.out.print("n2= ");
        n2 = input.nextInt();
        System.out.println("selection types are:\n1-add two numbers\n" +
                "2-subtract two numbers\n3-multiply two numbers\n4-divide two nuymbers");
        System.out.print("please enter your selection: ");
        selection = input.nextInt();
        //1- if else statement
        if (selection == 1) {
            System.out.printf("add numbers:%d + %d = %d", n1, n2, (n1 + n2));
        } else if (selection == 2) {
            if (n1 >= n2)
                System.out.printf("subtract numbers:%d - %d = %d", n1, n2, (n1 - n2));
            else System.out.println("n1 should not be small than n2");
        } else if (selection == 3) {
            System.out.printf("multiply numbers:%d * %d = %d", n1, n2, (n1 * n2));
        } else if (selection == 4) {
            if (n2 != 0)
                System.out.printf("divide numbers:%d / %d = %d", n1, n2, (n1 / n2));
            else System.out.println("n2 should not be equal to 0");
        } else System.out.println("the wrong selection, please try again");

        // 2-Switch Statement
        switch (selection) {
            case 1:
                System.out.printf("add numbers:%d + %d = %d", n1, n2, (n1 + n2));
                break;
            case 2:
                if (n1 >= n2)
                    System.out.printf("subtract numbers:%d - %d = %d", n1, n2, (n1 - n2));
                else System.out.println("n1 should not be small than n2");
                break;
            case 3:
                System.out.printf("multiply numbers:%d * %d = %d", n1, n2, (n1 * n2));
                break;
            case 4:
                if (n2 != 0)
                    System.out.printf("divide numbers:%d / %d = %d", n1, n2, (n1 / n2));
                else System.out.println("The divisible number must not be 0");
                break;
        }

    }
}
