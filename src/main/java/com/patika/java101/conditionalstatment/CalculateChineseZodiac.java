package com.patika.java101.conditionalstatment;

import java.util.Scanner;

public class CalculateChineseZodiac {
    public static void main(String[] args) {
        /* How is the Chinese Zodiac calculated?
When calculating the Chinese zodiac, it is found according to the remainder of the 12th
division of the person's birth year.
Date of Birth 12% = 0 ➜ Monkey
Date of Birth 12% = 1 ➜ Rooster
Date of Birth 12% = 2 ➜ Dog
Date of Birth 12% = 3 ➜ Pig
Date of Birth 12% = 4 ➜ Mice
Date of Birth 12% = 5 ➜ Ox
Date of Birth 12% = 6 ➜ Tiger
Date of Birth 12% = 7 ➜ Rabbit
Date of Birth 12% = 8 ➜ Dragon
Date of Birth 12% = 9 ➜ Snake
Date of Birth 12% = 10 ➜ Horse
Date of Birth 12% = 11 ➜ Sheep
*/
        int date, remainder;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter date of birth: ");
        date = input.nextInt();
        remainder = date % 12;
        if (date > 0) {
            String result = switch (remainder) {
                case 0 -> ("Monkey");
                case 1 -> ("Rooster");
                case 2 -> ("Dog");
                case 3 -> ("Pig");
                case 4 -> ("Mice");
                case 5 -> ("Ox");
                case 6 -> ("Tiger");
                case 7 -> ("Rabbit");
                case 8 -> ("Dragon");
                case 9 -> ("Snake");
                case 10 -> ("Horse");
                case 11 -> ("Sheep");
                default -> " ";
            };
            System.out.printf("%d / 12 = %d\n", date, remainder);
            System.out.println("your chinese zodiac is " +result);
        } else
            System.out.println("Birth date should be big than 0");

    }
}
