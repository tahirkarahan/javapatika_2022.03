package com.patika.java101.conditionalstatment;

import java.util.Scanner;

public class ClassScore {
    public static void main(String[] args) {
        //if  else  model
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your score:");
        int myScore = input.nextInt();
        if (myScore >= 60) {
            System.out.println("Congratulations!!! you pass the exam.");
        } else {
            System.out.println("you failed the exam, hard work!");
        }


        // 2- nested if
        // if   else if     else if    else if ......else    model
        Scanner Myinput = new Scanner(System.in);
        System.out.print("Please enter your score:");
        int score = Myinput.nextInt();
        if (score <= 100 && score >= 0) {
            if (100 > score && score >= 90)
                System.out.println("Great!! your grade is A");
            else if (90 > score && score >= 80)
                System.out.println("Good job!! your grade is B");
            else if (80 > score && score >= 60)
                System.out.println("Not bad!! your grade is C");
            else
                System.out.println("you failed the exam, hard work please!!");
        } else {
            System.out.println("Please enter valid score(score should be between 100 and 0)");
        }
    }
}
