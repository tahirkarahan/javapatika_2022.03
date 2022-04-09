package com.patika.java101.loops;

import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("n= ");
        n=input.nextInt();
        for (int i=1; i<=n; i++){
            if (i%2==0)continue;
            System.out.print(i+",");
        }
    }
}
