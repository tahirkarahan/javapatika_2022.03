package com.patika.java101.methods;

import java.util.Scanner;

public class CalculatePower {
    /*Calculating Exponents with Recursive Methods
    * In the Java language, write a program that uses the "Recursive" method for exponentiation,
     whose base and exponent values are taken from the user.
     */

    public static void main(String[] args) {
        double baseNum, exponentValues;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        baseNum = input.nextDouble();
        System.out.print("Enter the exponent values: ");
        exponentValues = input.nextDouble();
        //System.out.print(power(baseNum,exponentValues));
        System.out.println(pow(baseNum, exponentValues));
    }

//    public static double power(double x, double n){
//        return Math.pow(x,n);
//    }

    public static double pow(double x, double n) {
        if (x == 0) {
            return 0;
        }
        if (x == 1 || n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }

        if (n < 0) {
            n = -n;
            x = 1.0 / x;
        }

        return x * pow(x, n - 1);
    }


}
