package com.patika.java101.datastructure;

import java.util.Arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] num = new int[]{200, 5, 310, 2, 54, 5, 40, 5, 150};
        //or
        //int[] number={200, 5, 310, 2, 54, 5, 40, 5, 150};
        System.out.println(num.length);
        // calculate sum of the array elements
        int sum = 0;
        for (int j : num) {
            System.out.print(j + " ");
            sum += j;
        }
        System.out.println();
        System.out.print("sum of the array elements is:" + sum);
        System.out.println();


        //find out max and min number
        System.out.println("-----print out max and min number--------");
        int maxNumber = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > maxNumber) {
                maxNumber = num[i];
            }
            System.out.print(num[i] + " ");
        }
        System.out.print("\nThe max number is:" + maxNumber);
        Arrays.sort(num);
        System.out.println("\nThe min number is:" + num[0]);
        System.out.println( Arrays.toString(num));


        // find out match numbers(find out same number in the array)
        int i = 5;
        int totalMatch = 0;
        for (int numbers : num) {
            if (numbers == i) {
                totalMatch++;
            }
        }
        System.out.println("total match is:" + totalMatch);
        if (totalMatch == 0)
            System.out.println("there is no items to match with the value" + i);
    }
}
