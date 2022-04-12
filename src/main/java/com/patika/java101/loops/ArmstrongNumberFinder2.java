package com.patika.java101.loops;

public class ArmstrongNumberFinder2 {
    public static void main(String[] args) {
        // find out Armstrong numbers between 100--1000.
            int tempNumber ;
            int digitCounts ;
            int digitValue;
            int digitPower ;
            int result ;
        for (int i=100; i<=999; i++){
            digitCounts=0;
            tempNumber=i;
        //Finding count of Digits
            while (tempNumber != 0) {
                tempNumber /= 10;
                digitCounts++;
            }
            //Finding the last digit of a number
            tempNumber = i;
            result=0;
            while (tempNumber != 0) {
                digitValue = tempNumber % 10;
                //calculate sum of the nth powers of each digits
                //digitPower=1;
//            for (int i = 1; i <= digitCounts; i++) {
//                digitPower *=digitValue;//(digitPower*digitValue)
//            }
                digitPower = (int) Math.pow(digitValue, digitCounts);
                result += digitPower;
                tempNumber /= 10;
            }

            if (result == i) {
                System.out.println(String.format("%d is an Armstrong number", i));
            }
        }
    }
}
