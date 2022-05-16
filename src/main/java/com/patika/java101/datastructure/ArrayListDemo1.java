package com.patika.java101.datastructure;

import java.util.*;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter length of array: ");
        int lengthOfArray = input.nextInt();
        Integer[] numbers = new Integer[lengthOfArray];
        int maxNum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100 + 1);
            if (numbers[i] > maxNum)
                maxNum = numbers[i];
            System.out.print(numbers[i] + " ");
        }
        Arrays.sort(numbers);
        System.out.println("\n" + Arrays.toString(numbers));
        System.out.print("The max number in this array is: " + maxNum);
        System.out.print("\nThe min number in this array is: " + numbers[0]);
        System.out.println("\n-----Convert array to array list-------");
        List<Integer> numList = new ArrayList<>(Arrays.asList(numbers));
        System.out.println(numList);
        numList.add(150);
        numList.add(200);
        System.out.println("New size of the list is: " + numList.size());
        System.out.print("The min number in this list is: " + numList.get(0));
        System.out.print("\nThe max number in this list is: " + numList.get(lengthOfArray + 1));
        System.out.println();
        for (int i = numList.size() - 1; i >= 0; i--) {
            System.out.print(numList.get(i) + " ");
        }

    }

}

