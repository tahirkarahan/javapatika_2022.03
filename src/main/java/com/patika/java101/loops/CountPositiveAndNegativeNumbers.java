package com.patika.java101.loops;

import java.util.Scanner;

public class CountPositiveAndNegativeNumbers {
    public static void main(String[] args) {
        // Scanner
        System.out.println("please enter numbers:");
        Scanner scanner=new Scanner(System.in);
        int positiveNumberCounts=0;
        int negativeNumberCounts=0;
        while (true){
            int numbers=scanner.nextInt();
            if (numbers>0){
                positiveNumberCounts++;
            }
            else if (numbers<0){
                negativeNumberCounts++;
            }
            else
                break;
        }
        System.out.println("Positive number counts:"+positiveNumberCounts);
        System.out.println("negative number counts:"+negativeNumberCounts);
    }
}
