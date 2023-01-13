package com.syntax.review2;

public class NestedIf {
    public static void main(String[] args) {
        /*
        nested if is 1 if statement inside another if statement
        we need it when we have 1 condition that depends on another
         */
        boolean vaccine=true;
        int dose=0;
        if(vaccine){  // outer if statement
            System.out.println("How many doses you got");
            if(dose==1){  // inner if statement// nested if statement
                System.out.println("you need a second shot");
            }else{
                System.out.println("You are fully vaccinated");
            }
        } else{
            System.out.println("I do not have a vaccine");
        }// the end of the outer if statement
    }
}
