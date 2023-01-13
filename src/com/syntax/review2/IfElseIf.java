package com.syntax.review2;

public class IfElseIf {
    public static void main(String[] args) {
        int homework=40;
        if(homework>25){
            System.out.println("Great Job");
        }else if(homework>20){
            System.out.println("Good Job");
        }else if(homework>10){
            System.out.println("Ok Job");
        } else if (homework>5) {
            System.out.println("Not Good Job");
        }
          // this is a second example

        String browser="Opera";
        if(browser.equals("chrome")){
            System.out.println("Test cases executed on chrome browser");
        }else if(browser.equals("safari")){
            System.out.println("Test case executed on safari browser");
        }else if(browser.equals("Firefox")){
            System.out.println("Test cases executed on firefox browser");
        }else{  // when none of the conditions are true, code comes to else block
            System.out.println("Browser is not supported");
        }


        }
    }

