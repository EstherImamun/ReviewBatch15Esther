package com.syntax.review4;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // While Loop
        int a = 1;
        while (a <= 3) {
            System.out.println("I am a while loop");
            a++;
        }
        // When we do not know how many times we need to repeat a block of code
        // while or do while

        int b = 1;
        do {
            System.out.println("do while");
            b++;
        }while (b>=3);

        // Ask students if they understand loops?
        // if they don't --> tell them to practice more on loops
        // if they understand, --> you're good. move to Array concept

        Scanner scan=new Scanner(System.in);
        String answer;
        do {
            System.out.println("Do you understand loops in Java");
            answer = scan.nextLine();
        }while(!answer.equalsIgnoreCase("Yes"));

        System.out.println("Great job! Let's learn arrays now");





    }
}
