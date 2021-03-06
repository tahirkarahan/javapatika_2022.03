package com.patika.java101.methods;

import java.util.Scanner;

public class FindingPalindromicWords {
   public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalindrome1(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("please enter a word: ");
        String word=input.next();
        System.out.println(isPalindrome1(word));
    }

}
