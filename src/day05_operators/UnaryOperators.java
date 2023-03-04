package day05_operators;

public class UnaryOperators {

    public static void main(String[] args) { //pre and post

        // pre increment/decrement ==> change the value immediately

        int x = 10;
        System.out.println(++x); //==>11
        System.out.println(x); //==>11 print after increase will show the new value

        int y = 100;
        System.out.println(--y); //99

        System.out.println("-----------------------------------------");

        // post increment/decrement ==> old value will be used first

        int p = 10;
        System.out.println(p++); // 10
        System.out.println(p); // 11

        int r = 25;
        System.out.println(r--); // 25
        System.out.println(r); // 24


    }
}
