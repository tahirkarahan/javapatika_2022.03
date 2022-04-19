package com.patika.java101.methods;

public class FindPalindromicNumber {
    /* What is Palindrome Number?
Palindromic numbers are numbers that have the same reading direction when read from both sides.
example: 1, 4, 8, 99, 101, 363, 4004, 9889....*/
    static boolean isPalindromic(int number) {
        int temp = number, reverse = 0, lastDigit;
        while (temp != 0) {
           // System.out.println("***********");
            lastDigit = temp % 10;
           // System.out.println("last digit=> " + lastDigit);
            reverse = (reverse * 10) + lastDigit;
           // System.out.println("reverse number=> " + reverse);
            temp /= 10;
           // System.out.println("new tem number=> " + temp);
        }
        if (number == reverse) {
            System.out.println(number + " is a Palindromic number ");
        } else {
            System.out.println(number + " is not a Palindromic number ");
        }
        return reverse == number;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromic(101));
    }

}
