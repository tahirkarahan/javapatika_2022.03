package com.patika.java101.datastructure;

public class FindOutFrequencyInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 5, 1, 4, 7, 4, 6, 5, 8, 7, 8, 9, 2, 6, 5, 1};
        int[] frq = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    //To avoid counting same element again
                    frq[j] = visited;
                }
            }
            if (frq[i] != visited)
                frq[i] = count;
        }
        //Displays the frequency of each element present in array
        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for (int i = 0; i < frq.length; i++) {
            if (frq[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + frq[i]);
        }
        System.out.println("----------------------------------------");

        //execute the method blow
        System.out.println("---frequencies in a sorted array----");
        int[] array = {10, 20, 30, 30, 30, 40, 50, 50, 50, 50, 70};
        int n = array.length;
        findFrequencies(array, n);

    }

     // Java program to count number of occurrences of
     // each element in the array in O(n) time and O(1) space

    // create a method
    public static void findFrequencies(int[] ele, int n) {
        int freq = 1;
        int idx = 1;
        int element = ele[0];
        while (idx < n) {
            // check if the current element is equal to
            // previous element.
            if (ele[idx - 1] == ele[idx]) {
                freq++;
                idx++;
            } else {
                System.out.printf("The number %s is repeated %d times%n",element,freq);

                element = ele[idx];
                idx++;

                // reset the frequency
                freq = 1;
            }
        }

    }

}

