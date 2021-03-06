package com.patika.java101.conditionalstatment;

import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {

        /***  routine
         *  1- At first, we have to decide a range for the guess number that would be guessed;
         *  2- To input a random number in range;
         *  3- Guess-time should be 0 and decide guess-time count;
         */
        System.out.print("please enter the range : ");
        Scanner input = new Scanner(System.in);
        int range = input.nextInt();
        int theNumber = (int) (Math.random() * range + 1);
        System.out.println(theNumber);
        System.out.println(" a number had been guessed in range.");
        int guestimes = 0;
        boolean isWin = false;
        while (guestimes < 7) {
            System.out.print("Enter the number had been guessed :");
            int answer = input.nextInt();
            guestimes++;
            if (answer > theNumber) {
                System.out.printf("It's too big, you have %s chances\n", 7 - guestimes);
            } else if (answer < theNumber) {
                System.out.printf("It's too small, you have %s chances\n", 7 - guestimes);
            } else if (answer == theNumber) {
                isWin = true;
                break;
            }
        }
        if (isWin)
            System.out.printf("Woow!! you are awesome,you find uot the number that had been guessed on %s times \n", guestimes);
        else
            System.out.println(" Ohh!! soo sorry, you are failed. the game is over");
    }
}


