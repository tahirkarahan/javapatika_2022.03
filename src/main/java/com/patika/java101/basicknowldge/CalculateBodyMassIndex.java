package com.patika.java101.basicknowldge;

import java.util.Scanner;

public class CalculateBodyMassIndex {
    public static void main(String[] args) {
        /*With Java, take the height and weight values from the user and assign them to a variable.
        Calculate the user's "Body Mass Index" according to the formula below and print it on the screen.
        Formula: massIndex = Kilo (kg) / Boy(m) * Boy(m)
         */
        double height, massIndex;
        int weight;
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter your height:  " );
        height=input.nextDouble();
        System.out.print("Please enter your weight:  " );
        weight=input.nextInt();
        massIndex =  weight/Math.abs(height);
        System.out.printf("Your body mass index is= %.2f",massIndex);
        System.out.println();

    }
}
