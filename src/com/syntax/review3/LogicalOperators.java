package com.syntax.review3;

public class LogicalOperators {
    public static void main(String[] args) {

        System.out.println("------------------LOGICAL (AND) && --------------------------------------");

        boolean loginButtonDisplayed=true;
        boolean loginButtonClickable=false;              // LOGICAL OPERATOR &&
        if(loginButtonDisplayed&&loginButtonClickable){ // for the && logical operator, if one condition is false,
            System.out.println("Test case is passed");  // the result on the console will be false
        }else{
            System.out.println("Test case failed");
        }
        System.out.println("-------------------------LOGICAL (OR)|| -------------------------------");
        //LOGICAL OPERATOR ||
        // If one condition is true and the other is false then the result will be true.
        // but if both conditions are false,then the result will be false.
        boolean dashboard=false;
        String message="Welcome admin";
        if(dashboard || message.equals("Welcome admin")){
            System.out.println("User is successfully logged in");
        }else{
            System.out.println("User is not logged in");
        }
        System.out.println("--------------------LOGICAL (NOT) ! -----------------------------------");
        // LOGICAL OPERATOR !
        // the ! (NOT) operator reverses conditions

        boolean b=true;
        System.out.println(!true);


        boolean agreeCheckboxSelected=false;
        if(!agreeCheckboxSelected){
            System.out.println("I am clicking on checkbox");
        }
        System.out.println("I am clicking on submit button");






    }
}
