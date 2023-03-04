package day04_concatenation;

public class ArithmeticOperators {

    public static void main(String[] args) {
        /*
        Addition +
        Subtraction -
        Division /
        Multiplication *
        Modulus % (divides two value and returns the remainder) 10%3 ==>1

         */
        System.out.println(12 + 9);
        System.out.println(12 - 9);
        System.out.println("----------------------------------------------------");
        System.out.println(12 / 9);//(will not return decimal number.
                                   // If want decimal return, put 12 / 9.0)
        // int / int ==> int
        System.out.println(12 / 9.0);// int / double ==> double
        System.out.println(12.0 / 9);// double / int ==> double
        System.out.println(12d / 9);
        System.out.println((int) (12.0 / 9.0));// if you want double (decimal) to return in integer use explicit casting
        //System.out.println(12 / 0); ==> CANNOT / by 0

        System.out.println("----------------------------------------------------");
        System.out.println(12 * 9);
        System.out.println(12 % 9);
    }
}
