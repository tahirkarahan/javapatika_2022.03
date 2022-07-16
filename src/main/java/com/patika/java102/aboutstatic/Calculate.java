package com.patika.java102.aboutstatic;

public class Calculate {
    public static void calcAverage(int[] notes) {
        double total = 0;
        for (int i : notes) {
            total = total + i;

        }
        double average = total / notes.length;
        System.out.print("Average note is: " + average);

    }
}
