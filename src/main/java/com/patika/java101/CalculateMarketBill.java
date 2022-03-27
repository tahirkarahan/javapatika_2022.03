package com.patika.java101;

import java.util.Scanner;

public class CalculateMarketBill {
    public static void main(String[] args) {
        /* Fruits and price for per KG
    Pear : 2,14 TL
    Apple : 3,67 TL
    Tomatoes : 1,11 TL
    Banana: 10,50 TL
    Eggplant : 5,00 TL
    */
        double pear, apple, tomatoes, banana, eggplant;
        Scanner input=new Scanner(System.in);
        System.out.print("How much the weight of pear: ");
        pear=input.nextDouble();
        //System.out.print("KG");
        double costOfPear=2.14*pear;
        System.out.print("How much the weight of apple: ");
        apple=input.nextDouble();
        double costOfApple=3.67*apple;
        System.out.print("How much the weight of tomatoes: ");
        tomatoes=input.nextDouble();
        double costOfTomatoes=1.11*tomatoes;
        System.out.print("How much the weight of banana: ");
        banana=input.nextDouble();
        double costOfBanana=10.50*banana;
        System.out.print("How much the weight of eggplant: ");
        eggplant=input.nextDouble();
        double costOfEggplant=5.00*eggplant;
        double total=costOfPear+costOfApple+costOfTomatoes+costOfBanana+costOfEggplant;
        System.out.print("Total: "+total);

    }
}
