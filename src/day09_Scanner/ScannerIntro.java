package day09_Scanner;

import java.util.Scanner;
public class ScannerIntro {

    public static void main(String[] args) { //Scanner for byte, short, int, long

        Scanner input = new Scanner(System.in); // for reading the keywords only (user inputs)

        System.out.println("Enter the number: "); // ask user to put the input

        byte num1 = input.nextByte();

        System.out.println("You entered: " +num1);

        System.out.println("enter you second number: ");
        short num2 = input.nextShort();

        System.out.println("second number is: "+num2);
        int num3 = input.nextInt();

        System.out.println("Enter your fourth number:");

        long num4 = input.nextLong();

        System.out.println("First number: "+num1);
        System.out.println("Second number: " + num2);
        System.out.println("Third number: "+num3);
        System.out.println("Fourth number: "+num4);


        input.close(); // scanner is closed, CANNOT read user inputs again
    }


}
