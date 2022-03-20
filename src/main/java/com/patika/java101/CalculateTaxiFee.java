package com.patika.java101;

import java.util.Scanner;

public class CalculateTaxiFee {
    public static void main(String[] args) {
        int startPrice = 10;
        int minimum = 20;
        int km;
        double total;
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your trip distance: ");
        km = input.nextInt();
        total = startPrice + 2.20 * km;
//        total=(total<20) ? minimum :total;
//        System.out.println(total);
        double lastFee = total;
        if (lastFee >= 20) {
            System.out.printf(" 10.0+2.20*%f = %.2f\n", km, total);
            System.out.printf("your trip fee is %.2f: ", total);
        } else
            System.out.println("your trip fee is : " + minimum);

    }
}
