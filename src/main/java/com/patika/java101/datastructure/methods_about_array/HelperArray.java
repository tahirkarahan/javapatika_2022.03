package com.patika.java101.datastructure.methods_about_array;

public class HelperArray {

    // method of print out array
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int array : arr) {
            System.out.print(array + ",");
        }
        System.out.print("]");
    }

    public static void printArray(String[] arr) {
        System.out.print("[");
        for (String name : arr) {
            System.out.print(name + ",");
        }
        System.out.print("]");
    }

    public static void fillValue(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }

    }

    public static void fillValue(int[] arr, int value, int beginningIndex, int endingIndex) {
        for (int i = beginningIndex; i <= endingIndex; i++) {
            arr[i] = value;
        }
    }

    //search
    public static int searchValue(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isEqual(int[] list1, int[] list2) {
        if (list1.length != list2.length)
            return false;

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i])
                return false;
        }
        return true;
    }
}
