package com.syntax.review2;

import java.util.Scanner;

public class ScannerExample { // 'high level' means something that's not in detail
    public static void main(String[] args) { // scanner is a program that helps us be interactive
        int i=10;
             // scanner is a non primitive datatype
             Scanner keyboard=new Scanner(System.in);
        System.out.println("Please enter your age");
             int age=keyboard.nextInt(); // to capture int values
        System.out.println("Are you tired");
             boolean tired=keyboard.nextBoolean(); // to capture boolean values
        System.out.println("What is your name");
            String name= keyboard.next(); // to capture String until space// used for one word.
             keyboard.nextLine(); // to capture an entire sentence of String.
        System.out.println(age);
        System.out.println(tired);
        System.out.println(name);

    }// never use (.nextLine();) last, only use it first
}    // you can use (.next();) first or last, depends on you
