package com.patika.java101.datastructure;

import java.util.Scanner;

public class CalculateHarmonicAverage {
    public static void main(String[] args) {
        int[] arr = {15, 26, 35, 27, 45, 56, 49, 65, 39};
        double result = 0.0;
        for (int i = 1; i <arr.length; i++) {
            result += (1.0 / arr[i]);
        }
        System.out.println(arr.length/result);
    }
}
