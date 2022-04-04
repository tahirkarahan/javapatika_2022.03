package com.patika.java101;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        boolean a = true, b = false;
//        System.out.println((a && b) || (a || b));
//        int not;
//        Scanner in=new Scanner(System.in);
//        not=in.nextInt();
//        System.out.println(not>45 ?"gecti":"kaldi");
        int points = 6;
        switch (points) {
            case 6:
            case 7:
                System.out.println("Java");
               // break;
            case 8:
            case 9:
                System.out.println("101");
               //  break;
            case 10:
                System.out.println("Patika");
                break;
            default:
                System.out.println("Dev");
        }
    }
}
