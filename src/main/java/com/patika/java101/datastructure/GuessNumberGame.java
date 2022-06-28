package com.patika.java101.datastructure;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        System.out.print("please enter the range : ");
        Scanner input = new Scanner(System.in);
        int range = input.nextInt();
        Random ran = new Random();
        int theNumber = ran.nextInt(range);
        // int theNumber=(int)(Math.random()*100);
        System.out.println(theNumber);
        System.out.println("A number had been guessed in range.");
        int right = 0;
        int answer;
        boolean isWin = false;
        int[] wrongGuess = new int[5];
        while (right < 5) {
            System.out.print("Please enter your guess:");
            answer = input.nextInt();
            //++right;
            if (answer == theNumber) {
                System.out.printf("Wow!! you are awesome,you find uot the number that had been guessed on %s times \n", right);
                isWin = true;
                break;
            } else {
                if (answer > theNumber) {
                    System.out.println(answer + " bigger than the target number");
                } else {
                    System.out.println(answer + " smaller than the target number.");
                }
                System.out.println(String.format("You have %d chance : ", (4 - right)));
                wrongGuess[right++] = answer;
            }
        }
        if (!isWin) {
            System.out.println("You are failed ! ");
            System.out.println("Your Guess : " + Arrays.toString(wrongGuess));
        }
    }
}

