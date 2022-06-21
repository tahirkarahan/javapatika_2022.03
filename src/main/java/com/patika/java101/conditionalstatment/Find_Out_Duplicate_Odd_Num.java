package com.patika.java101.conditionalstatment;

import java.util.Arrays;

public class Find_Out_Duplicate_Odd_Num {
    public static void main(String[] args) {
        int[] list = {3, 7, 4, 4, 2, 9, 10, 21, 10, 33, 4, 2};
        int[] duplicatedOdd = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && list[i]%2==0) {
                    duplicatedOdd[startIndex++] = list[i];
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(duplicatedOdd));
    }
}
