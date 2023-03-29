package day15_whileLoop;

import java.util.Scanner;

public class MaxAndMinNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = -2147483648; //the lowest of int
        int min = 2147483647;

        for (int i = 0; i < 5 ; i++) {

            System.out.println("Enter the number");
            int num = input.nextInt();

            if (num > max){
                max = num;
            }

            if (num < min){
                min = num;
            }
        }
        System.out.println("max = " +max);
        System.out.println("min = " + min);
    }
}

/*

	1. Write a program that can ask the user to enter a number for 5 times and returns the maximum and minimum number

 */