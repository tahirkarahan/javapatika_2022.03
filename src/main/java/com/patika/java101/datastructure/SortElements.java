package com.patika.java101.datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class SortElements {
    /*Write a program in Java that sorts the elements of the array from smallest to largest. Get the size
    of the array and the elements of the array from the user.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter length of list n: ");
        int n = input.nextInt();
        int[] list = new int[n];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + " . Element : ");
            list[i] = input.nextInt();
        }
        Arrays.sort(list);
        System.out.println("Sort of Array: " + Arrays.toString(list));
    }
}
