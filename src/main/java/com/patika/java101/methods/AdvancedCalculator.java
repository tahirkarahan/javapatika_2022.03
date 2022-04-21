package com.patika.java101.methods;

import java.util.Scanner;

public class AdvancedCalculator {
    public static int addTwoNumbers(int a, int b) {
        int sum = a + b;
        System.out.println(String.format("%d +%d =%d", a, b, sum));
        return sum;
    }

    public static int subtractTwoNumbers(int a, int b) {
        int result = a - b;
        System.out.println(String.format("%d -%d =%d", a, b, result));
        return result;
    }

    public static int multiplyTwoNumbers(int a, int b) {
        int result = a * b;
        System.out.println(String.format("%d * %d =%d", a, b, result));
        return result;
    }

    public static double dividedTwoNumbers(double a, double b) {
        if (b != 0) {
            double division = a / b;
            //float division=(float)(d1/d2);
            System.out.println(String.format("%.2f / %.2f = %.2f", a, b, division));
            return division;
        } else {
            System.out.println("b can not equals to zero");
            return 0;
        }
    }

    public static int absoluteResult(int a) {
        int abs = Math.abs(a);
        System.out.printf("absolute value of %d is %d \n", a, abs);
        return abs;
    }

    public static int maxNum(int a, int b) {
        System.out.println(String.format(" maximum number of %d and %d is %d", a, b, Math.max(a, b)));
        return Math.max(a, b);
    }

    public static int minNum(int m, int n) {
        System.out.println(String.format(" minimum number of %d and %d is %d", m, n, Math.min(m, n)));
        return Math.min(m, n);
    }

    public static int power(int a, int b) {
        long result = (long) Math.pow(a, b);
        System.out.println(String.format("power of %d's %d degree is %d", a, b, result));
        return (int) result;
    }

    public static double squareRoot(double z) {
        double sqrt = Math.sqrt(z);
        System.out.printf("square root of %.2f is %.2f\n", z, sqrt);
        return sqrt;
    }

    public static int calculateModding(int a, int b) {
        int mod = a % b;
        System.out.println(String.format("modding of %d from %d  is %d", a, b, mod));
        return mod;
    }


    public static void rectangleAreaAndPerimeter(int l, int w) {
        if (l <= 0 || w <= 0) {
            System.out.println("length and width should not be less than or equal to 0.");
        } else {
            System.out.println("Rectangle Area: " + l * w);
            System.out.println("Rectangle Perimeter: " + 2 * (l + w));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selection;
        String Menu = "1.Add Two Numbers\n"
                + "2.Subtract Two Numbers\n"
                + "3.Multiply Two Numbers\n"
                + "4.Divided Two Numbers\n"
                + "5.Absolute Result\n"
                + "6.Find Max Number\n"
                + "7.Find Min Number\n"
                + "8.Find Power\n"
                + "9.Find Square Root\n"
                + "10.Calculate Modding\n"
                + "11.Calculate Area And Perimeter of Rectangle\n"
                + "0.Exit";
        System.out.println(Menu);
        while (true) {
            System.out.print("please select from Menu what do you want to do:");
            selection = input.nextInt();
            if (selection == 0)
                break;
            System.out.print("please enter first number: ");
            int a = input.nextInt();
            System.out.print("please enter second number: ");
            int b = input.nextInt();
            switch (selection) {
                case 1 -> addTwoNumbers(a, b);
                case 2 -> subtractTwoNumbers(a, b);
                case 3 -> multiplyTwoNumbers(a, b);
                case 4 -> dividedTwoNumbers(a, b);
                case 5 -> absoluteResult(a);
                case 6 -> maxNum(a, b);
                case 7 -> minNum(a, b);
                case 8 -> power(a, b);
                case 9 -> squareRoot(a);
                case 10 -> calculateModding(a, b);
                case 11 -> rectangleAreaAndPerimeter(a, b);
                default -> System.out.println("Sorry!!You entered wrong number");
            }

        }
        System.out.println("Thanks for using!!! Bye-Bye");

    }

}
