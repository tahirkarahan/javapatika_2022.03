package com.patika.java101.loops;

import java.util.Scanner;

public class EbobAndEkobFinder {
    public static void main(String[] args) {
        /*EBOB : İki ya da daha fazla doğal sayının ortak bölenlerinin en büyüğüne bu sayıların en büyük ortak böleni,
         kısaca EBOB‘u denir.
        *EKOK : İki ya da daha fazla doğal sayının ortak katlarının en küçüğüne bu sayıların en küçük ortak katı,
         kısaca EKOK‘u denir.
         */
        int n1, n2;
        Scanner input = new Scanner(System.in);
        System.out.print("n1=");
        n1 = input.nextInt();
        System.out.print("n2=");
        n2 = input.nextInt();
        int Ebob = 1;
        int n=Math.min(n1, n2);
        //int n = (n1 < n2) ? n1 : n2;


        // Find out Ebob
        //1-way
//        for (int i = 1; i <= n; i++) {
//            if (n1 % i == 0 && n2 % i == 0) {
//                System.out.println(i);
//                Ebob = i;
//            }
//        }
//        System.out.println(String.format("The greatest common divisor of %d and %d is %d",n1,n2,Ebob));

        // 2-way
        for (int i = n; i > 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                //System.out.println(i);
                Ebob = i;
                break;
            }
        }
        System.out.println(String.format("The greatest common divisor of %d and %d is %d", n1, n2, Ebob));

        // Find out Ekob
        int Ekob = 1;
        for (int i = 1; i <= (n1 * n2); i++) {
            if (i % n1 == 0 && i % n2 == 0) {
                Ekob = i;
                //System.out.println(i);
                break;
            }
        }
        System.out.println(String.format("Ekob= (%d * %d)/%d = %d", n1, n2, Ebob, Ekob));
    }
}
