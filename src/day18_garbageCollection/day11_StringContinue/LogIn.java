package day18_garbageCollection.day11_StringContinue;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the username:");
        String username = input.nextLine();

        System.out.println(" Enter the password:");
        String password = input.nextLine();

        if (username.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("You are now logged in");
        }else{
            System.err.println("Incorrect username or password. Please try again");
        }

        input.close();





    }
}
