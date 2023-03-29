package day18_garbageCollection.day14_forLoop;

import java.util.Scanner;

public class ForLoopScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*for (int i = 0; i < 10; i++) { //type fori for shortcut

            System.out.println("Enter the number");
            int num = input.nextInt();
        }*/

        int sum = 0;

        for (int i = 0; i <5; i++) { //type fori for shortcut

            System.out.println("Enter the number");
            sum += input.nextInt();

        } System.out.println(sum);

    }
}
