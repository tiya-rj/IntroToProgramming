package day09_Scanner;

import java.util.Scanner;

public class NextLine_vs_Next {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter you age: ");
        int age = input.nextInt(); // ==> 32+enter // bc nextInt only read input before the space so there will be "enter" left in the scanner.

        input.nextLine(); // by putting this nextLine scanner you will be able to provide the input

        System.out.println("Enter you full name: ");
        String full_name = input.nextLine();

        // but if you're using nextLine after nextLine you don't have to put additional input.nextLine() (Line 13) to clear the scanner bc nextLine read everything so there won't be anything left in the scanner.

        System.out.println("Enter your school name: ");
        String school_name = input.nextLine();

        System.out.println("age: " + age);
        System.out.println("full_name: " + full_name);
        System.out.println("school_name = " + school_name);
    }
}
