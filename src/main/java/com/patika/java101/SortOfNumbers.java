package com.patika.java101;

import java.util.Scanner;

public class SortOfNumbers {
    public static void main(String[] args) {
        // To sort 3 numbers from small to big
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("a=");
        a = input.nextInt();
        System.out.print("b=");
        b = input.nextInt();
        System.out.print("c=");
        c = input.nextInt();
        if (a < b && a < c) {
            if (b < c) {
                System.out.println("a<b<c");
            } else {
                System.out.println("a<c<b");
            }
        } else if (b < a && b < c) {
            if (a < c) {
                System.out.println("b<a<c");
            } else {
                System.out.println("b<c<a");
            }
        } else {
            if (a < b) {
                System.out.println("c<a<b");
            } else {
                System.out.println("c<b<a");
            }
        }
    }
}

