package com.patika.java101.conditionalstatment;

import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class LengthOfNumber {
    public static void main(String[] args) {
        //Switch case
        System.out.print("Please enter a number:");
        Scanner input=new Scanner(System.in);
        String number=input.next();
        if (StringUtils.isNumeric(number)){
            int numberLength=number.length();
            switch (numberLength){
                case 1:
                    System.out.println("The number is a single digit (between 1---9) number");
                    break;
                case 2:
                    System.out.println("The number is a double digit (between 10---99) number");
                    break;
                case  3:
                    System.out.println("The number is a three-digit (between 100---999) number");
                    break;
                case 4:
                    System.out.println("The number is a four-digit (between 1000---9999) number");
                    break;
                default:
                    System.out.println("The number greater than 10000");
            }
        }
        else {
            System.out.println("Please enter digit numbers");
        }
    }
}
