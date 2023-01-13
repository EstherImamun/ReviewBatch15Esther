package com.syntax.review2;

public class Casting {
    public static void main(String[] args) {
        /* Casting - converting 1 datatype into another
        1. widening- implicit/automatic
        (byte->short->int->long->float->double)
        2. narrowing-explicit/manual
        (double->float->long->int->short->byte)
        */
        // widening; because we're trying to fit an int data type into a double data type
        double d=5; // when we're trying to put a smaller datatype in a big box.
        System.out.println(d); // can also be converted into any datatype of your choice.


        // narrowing; because we're trying to fit in a double data type into an int
        int i=(int)5.0; // when we're trying to fit in a bigger datatype into a smaller one
        System.out.println(i);

        byte b=(byte)128;  // this is an explicit casting; we're going to print out the value of the variable
        System.out.println(b);  // even when it doesn't fit into the box, but our answer will be different.
    }

}
