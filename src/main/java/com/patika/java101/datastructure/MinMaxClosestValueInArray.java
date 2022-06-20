package com.patika.java101.datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxClosestValueInArray {
    /*Homework
             * Write a program that finds the closest number smaller than the entered number of
             * the elements in the array, and the closest closest number to the largest.
             * Array : {15,12,788,1,-1,-778,2,0}
             * Entered Number : 5
             * Nearest number smaller than the entered number: 2
             * The closest number greater than the entered number: 12
     */

    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println(Arrays.toString(list));
        Scanner input = new Scanner(System.in);
        System.out.print("The entered number: ");
        int x = input.nextInt();
        int diff, diffMin, diffMax, greaterClosest = 0 ,smallerClosest=0;
        diffMax =  Integer.MIN_VALUE;
        diffMin = Integer.MAX_VALUE;

        for (int i : list) {
            diff = x - i;
            if (diff < 0 && diff >= diffMax) {
                diffMax = diff;
                greaterClosest = i;
            }
            if (diff > 0 && diff <= diffMin) {
                diffMin = diff;
                smallerClosest = i;
            }
        }
        System.out.println("The nearest number smaller than the entered number : " + smallerClosest);
        System.out.println("The nearest number greater than the entered number : " + greaterClosest);
    }
}
