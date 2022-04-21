package com.patika.java101.conditionalstatment;

import java.util.Scanner;

public class MathGameApp {
    public static void main(String[] args) {
        System.out.print("please enter your name:");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.printf("Welcome to you come in to our Math game dear %s\n", name);
        System.out.println("How many question would you like to do ?");
        int questionNum = input.nextInt();
        System.out.printf("you will do %d questions\n", questionNum);
        //System.out.print(questionNum);
        System.out.println("ok! let's start the game");
        int point = 0;
        for (int i = 1; i <= questionNum; i++) {
            int x = (int) (Math.random() * 100 + 1);
            int y = (int) (Math.random() * 100 + 1);
            String questions = String.format("x=%d y=%d, what is the result of x+y ", x, y);
            System.out.println(questions);
            int answer = x + y;
            System.out.println("please enter your answer:");
            int number = input.nextInt();
            if (number == answer) {
                point++;
                System.out.println("you guessed right, your point=" + point);
            } else
                System.out.println("you guessed wrong, your point=" + point);
        }
        //verify the result
        if (point >= questionNum * 0.60)
            System.out.printf("Hi %s, your point is %d, congratulations! you win the game\n", name, point);
        else
            System.out.printf("Hi %s, your point is %d, Soo sorry! you lose the game", name, point);

    }
}
