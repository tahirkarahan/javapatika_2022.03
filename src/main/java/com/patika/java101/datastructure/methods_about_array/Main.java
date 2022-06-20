package com.patika.java101.datastructure.methods_about_array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list1 = {4, 8, 6, 44, 9, 78, 56, 78};
        int[] list2 = new int[]{12, 2, 56, 47, 89};
        int[] list3 = new int[5];
        list3[0] = 100;
        list3[1] = 125;
        list3[2] = 521;
        list3[3] = 456;
        list3[4] = 754;
        int[] list4 = new int[7];
        Arrays.fill(list4, 100);
        int[] list5 = new int[10];
        String[] name = {"Alim", "Tohti", "Murat", "Nejmi", "Adile"};

        //use for loop to print out the array
        System.out.println("*******list1*******");
        for (int i = 0; i < list1.length; i++) {
            System.out.print(list1[i] + ",");
        }
        System.out.println("\n" + Arrays.toString(list1));

        //use for each loop to print out the array
        System.out.println("*******list2*******");
        for (int j : list2) {
            System.out.print(j + ",");
        }
        System.out.println();

        // use the print method from HelperArray class
        System.out.println("*******list3*******");
        HelperArray.printArray(list3);

        System.out.println("\n*******list4*******");
        HelperArray.printArray(list4);

        System.out.println("\n*******list5*******");
        HelperArray.fillValue(list5, 25);
        HelperArray.printArray(list5);

        System.out.println("\n*******list5*******");
        HelperArray.fillValue(list5, 30, 3, 7);
        HelperArray.printArray(list5);

        System.out.println("\n" + HelperArray.searchValue(list1, 44));// 3 (index of 44 in list1)
        System.out.println(HelperArray.isEqual(list2, list3));//false
        HelperArray.fillValue(list2, 10);
        HelperArray.printArray(list2);
        System.out.println("\n*********");
        HelperArray.fillValue(list3, 10);
        HelperArray.printArray(list3);
        System.out.println("\n" + HelperArray.isEqual(list2, list3));//true

        System.out.println("\n******name********");
        HelperArray.printArray(name);


    }
}
