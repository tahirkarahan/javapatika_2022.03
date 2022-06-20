package com.patika.java101.classconcept.timeconversion;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        System.out.print("please enter a date: ");
        //Reading time for Standard Input
      // Time timeOfDay=new Time(new Scanner(System.in).nextLine());
        Scanner input=new Scanner(System.in);
        Time timeOfDay=new Time(input.nextLine());
        //Display Output
        System.out.println(timeOfDay.get24HourTime());
    }
}
