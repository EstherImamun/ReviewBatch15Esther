package com.syntax.review3;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {
        /* using scanner to ask user to enter browser
        based on the browser-> execute code
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter your favourite browser");

        String browser=scan.nextLine();

        switch(browser.toLowerCase()){ // will print results in uppercase in the console
            case "chrome":
                System.out.println("Test case executed in "+browser);
                break;
            case "safari":
                System.out.println("Test case executed in "+browser);
                break;
            case "microsoft edge":
                System.out.println("Test case executed in "+browser);
                break;
            default:
                System.out.println("Browser is unknown - No execution");
        }
        System.out.println("------------------------------------------------------------");
/*if we use the uppercase option then all our cases value which is also our String
variable value(Example "chrome") must be in uppercase.
        */
        switch(browser.toUpperCase()){
            case "CHROME":
                System.out.println("Test case executed in "+browser);
                break;
            case "SAFARI":
                System.out.println("Test case executed in "+browser);
                break;
            case "MICROSOFT EDGE":
                System.out.println("Test case executed in "+browser);
                break;
            default:
                System.out.println("Browser is unknown - No execution");
        }





    }
}
