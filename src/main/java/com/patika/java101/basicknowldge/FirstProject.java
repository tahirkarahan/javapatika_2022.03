package com.patika.java101.basicknowldge;

import java.util.Scanner;

public class FirstProject {
    public static void main(String[] args) {
        int math, chemistry, physic, history, music, art;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter math grade: ");
        math = input.nextInt();
        System.out.println("Please enter chemistry grade: ");
        chemistry = input.nextInt();
        System.out.println("Please enter physic grade: ");
        physic = input.nextInt();
        System.out.println("Please enter history grade: ");
        history = input.nextInt();
        System.out.println("Please enter music grade: ");
        music = input.nextInt();
        System.out.println("Please enter art grade: ");
        art = input.nextInt();
        double average = ((math + chemistry + physic + history + music + art) / 6.0);
        System.out.println("your average grade is : " + average);
        //boolean result = average >= 60 ? true : false; or
        boolean result = average >= 60;
        if (result)
            System.out.println("you passed");
        else
            System.out.println("you failed");

    }
}
