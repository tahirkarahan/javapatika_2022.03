package com.patika.java101.loops;

public class LoopStatements {
    public static void main(String[] args) {
        System.out.println("it is begin!!!!!!!!!!");
        int a=1;
        while(a<=5)
        {
            System.out.println(a);
            int k=10;
            while (k>0){
                System.out.println(k );
                int m=1;
                while (m<=20) {
                    System.out.print(m + ",");
                    m++;
                }
                System.out.println();
                k--;
            }
            a++;
        }
        System.out.println("it is end!!!!");
    }

}
