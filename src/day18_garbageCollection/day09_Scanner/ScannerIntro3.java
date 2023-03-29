package day18_garbageCollection.day09_Scanner;

import java.util.Scanner;
public class ScannerIntro3 { //Scanner for string and char

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0); // this is how to get a char

        System.out.println("You have entered: "+ch);


        System.out.println("Would you like to continue?");
        String answer = input.next();  // I do not know ==> I

        System.out.println(" You have entered: "+ answer);

        System.out.println("Any suggestion?");

        String answer1 = input.nextLine(); // I do not know ==> I do not know
        //but when you use nextLine after next method it will get bug. (won't wait for your input)

        System.out.println("You have entered: " + answer1);

        input.close();

    }

}


