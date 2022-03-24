package com.patika.java101;

import java.util.Scanner;

public class CalculateSectorArea {
    public static void main(String[] args) {
        /*Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
          𝜋 sayısını = 3.14 alınız.
          Formül : (𝜋 * (r*r) * 𝛼) / 360*/
        double p=3.14,s;
        int a,r;
        Scanner input=new Scanner(System.in);
        System.out.print("r= ");
        r=input.nextInt();
        System.out.print("a= ");
        a=input.nextInt();
        s=(p * (r*r) * a) / 360;
        System.out.printf("When r=%d, a=%d,  area of this sector s=%.2f",r,a,s);
    }
}
