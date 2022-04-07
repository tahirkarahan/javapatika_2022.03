package com.patika.java101.basicknowldge;

import java.util.Scanner;

public class SecondProject {
    public static void main(String[] args) {
        double netPrice, KDV, lastPrice;
        Scanner input=new Scanner(System.in);
        System.out.print("please enter the price: ");
        netPrice=input.nextDouble();
        KDV=netPrice<=1000.0 ? netPrice*0.18 : netPrice*0.08;
        System.out.println(String.format("KDV for this price is %.2f",KDV));
        lastPrice=netPrice+KDV;
        System.out.println(String.format("The last price you have to paid is %.2f +%.2f = %.2f"
                ,netPrice,KDV,lastPrice));


    }
}
