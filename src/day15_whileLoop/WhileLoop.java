package day15_whileLoop;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        while ( !(age > 0 && age <= 150)){ // Whenever the age is opposit with these range of age
            System.out.println("Invalid entry! Please re-enter your age: ");
            age = input.nextInt();
        }

        if( age >= 21){
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }

        System.out.println("Are you sleepy?");
        String yerOrNo = input.next().toLowerCase();

        while (!(yerOrNo.equals("yes") || yerOrNo.equals("no"))){
            System.err.println("Invalid answer. Please use yes or no.");
            yerOrNo = input.next().toLowerCase();
        }

        if(yerOrNo.equals("yes")){
            System.out.println("it's time to go to bed.");
        }else {
            System.out.println("it's party timeeee!!");
        }

        input.close(); // close statement of scanner
    }
}
/*
ask for repeat to answer until it's valid age. --> in case dont know how many time user will get it right. so use while loop
 */