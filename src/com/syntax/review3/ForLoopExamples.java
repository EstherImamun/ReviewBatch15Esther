package com.syntax.review3;

public class ForLoopExamples {
    public static void main(String[] args) {
      /*  for (int i = 10; i > 5; i++) { // first example
            System.out.println(i);
        }*/

        for (int i = 10; i > 5; i--) { // second example
            System.out.println(i);
        }

        for (int i = 5; i <= 1; i--) {
            System.out.println("Happy");
        }

        for (int i = 1; i <= 6; i++) {
            if (i % 2 == 0) {
                System.out.println("even number "+i);
            }
        }
    }
}