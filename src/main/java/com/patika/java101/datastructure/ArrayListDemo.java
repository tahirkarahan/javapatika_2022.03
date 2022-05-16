package com.patika.java101.datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        Integer[] evenNum = new Integer[]{18, 20, 10, 6, 12, 14, 6, 4, 8, 22, 2, 4, 6, 36};
        List<Integer> numList = new ArrayList<Integer>();

        // add array to array list
        Collections.addAll(numList, evenNum);
        System.out.println(numList);
        System.out.println(numList.size());

        // to add new element to array list
        numList.add(100);
        numList.add(80);
        Collections.sort(numList);
        System.out.println(numList);
        System.out.print("new size of list is:" + numList.size());
        System.out.println("\n***************");

        // remove element from array list
        numList.remove(6);
        numList.remove(7);
        System.out.println(numList);
        System.out.println("new size of list is:" + numList.size());

        //set(to change) array list elements
        numList.set(1, 2);
        numList.set(7, 16);
        System.out.println(numList);

        // get specific element from array list
        System.out.println(numList.get(5));
        System.out.println(numList.get(10));

        // find out the same elements from the list
        int n = 6;
        int totalCatch = 0;
        for (int numbers : numList) {
            if (numbers == n)
                totalCatch++;
        }
        System.out.println(String.format("There are %d catches in the array list", totalCatch));
    }
}
