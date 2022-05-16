package com.patika.java101.datastructure;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // define an integer array
        //first way
        int[] num = new int[7];
        num[0] = 2;
        num[1] = 5;
        num[2] = 10;
        num[3] = 52;
        num[4] = 54;
        num[5] = 100;
        num[6] = 150;
        //second way
        //int[] num=new int[]{2, 5, 10, 52, 54, 100, 150};
        System.out.println(num.length);

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();

        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
        System.out.println("\n----------------");

        for (int numbers : num) {
            System.out.print(numbers + " ");
        }
        System.out.println();

        // define a string array
        //first way
        String[] name = new String[4];
        name[0] = "Alim";
        name[1] = "Salim";
        name[2] = "Adil";
        name[3] = "Murat";
        System.out.println(name.length);
        System.out.println(Arrays.toString(name));
        name[2] = "Adalet";
        for (String s : name) {
            System.out.print(s + " ");
        }
    }
}
