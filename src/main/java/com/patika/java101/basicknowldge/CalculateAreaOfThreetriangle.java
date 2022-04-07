package com.patika.java101.basicknowldge;

import java.util.Scanner;

public class CalculateAreaOfThreetriangle {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a : ");
        a = input.nextInt();
        System.out.print("please enter b : ");
        b = input.nextInt();
        System.out.print("please enter c : ");
        c = input.nextInt();
        double u = (a + b + c) / 2;
        System.out.println("perimeter of three-triangle:  " + 2 * u);
        double s = u * (u - a) * (u - b) * (u - c);
        System.out.println("area of three-triangle: " + s);
    }
}
