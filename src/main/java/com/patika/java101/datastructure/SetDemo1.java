package com.patika.java101.datastructure;

import java.util.*;

public class SetDemo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Integer> num = new HashSet<Integer>();
        System.out.print("please enter size of the set:");
        int sizeOfSet = input.nextInt();
        for (int i = 0; i < sizeOfSet; i++) {
            num.add((int) (Math.random() * 100 + 1));
        }
        System.out.println(num);
        System.out.println("--------- add array elements to set---------");
        int[] num1 = new int[]{8, 9, 4, 7, 6, 3, 8, 1, 4, 5, 7, 9};
        System.out.print("num1=" + Arrays.toString(num1));
        System.out.print("\nlength of num1 list is:" + num1.length);
        int[] num2 = new int[]{1, 6, 3, 8, 1, 4, 5,};
        System.out.print("\nnum2=" + Arrays.toString(num2));
        System.out.print("\nlength of num2 list is:" + num2.length);
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < num1.length; i++) {
            set1.add(num1[i]);
        }
        System.out.println("\nset1=" + set1);
        System.out.print("size of set1 is:" + set1.size());
        System.out.print("\nMin number in the set1 is:" + Collections.min(set1));
        System.out.println("\nMax number in the set1 is:" + Collections.max(set1));
        Set<Integer> set2 = new HashSet<>();
        for (int numbers : num2) {
            set2.add(numbers);
        }
        System.out.println("\nset2=" + set2);
        System.out.print("size of set2 is:" + set2.size());
        System.out.print("\nMin number in the set2 is:" + Collections.min(set2));
        System.out.println("\nMax number in the set2 is:" + Collections.max(set2));
        System.out.println(set1.contains(6));
        System.out.println(set1.containsAll(set2));


    }
}
