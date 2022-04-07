package com.patika.java101.conditionalstatment;

import java.util.Scanner;

public class EventsAndTemperature {
    public static void main(String[] args) {
        /*Conditions :
    Suggest to "Ski" if the temperature is less than 5.
    Suggest the "Cinema" event if the temperature is between 5 and 15.
    Suggest the "Picnic" event if the temperature is between 15 and 25.
    Suggest the "Swimming" event if the temperature is greater than 25.
    */
        int temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the temperature:");
        temp = input.nextInt();
        if (temp < 5) {
            System.out.println("you can go ski");
        } else if (temp >= 5 && temp <= 25) {
            if (temp <= 15) {
                System.out.println("you can go cinema");
            }
            if (temp >= 10) {
                System.out.println("you can go picnic");
            }
        } else
            System.out.println("you can go swimming");
    }
}
