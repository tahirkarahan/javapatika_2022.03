package com.patika.java101.loops;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        //For loop
        for (boolean run = true; run; ) {
            System.out.print("please enter a number: ");
            a = input.nextInt();
            if (a < 0) {
                run = false;
                System.out.println(String.format("%d is a negative number", a));
            } else
                System.out.println(String.format("%d is a positive number", a));
        }

        // while loop
//        System.out.print("please enter a number: ");
//            a = input.nextInt();
//        while (a>=0) {
//            System.out.print("please enter a number: ");
//            a = input.nextInt();
//            System.out.println(String.format("%d is a positive number, please enter again:", a));
//            }
//                System.out.println(String.format("%d is a negative number", a));

        // do-while loop
//         do {
//             System.out.print("please enter a number: ");
//             a = input.nextInt();
//             System.out.println(String.format("%d is a positive number, please enter again:", a));
//         }while (a>=0);
//        System.out.println(String.format("%d is a negative number", a));
//        }
    }
    }


