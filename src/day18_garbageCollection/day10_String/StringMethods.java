package day18_garbageCollection.day10_String;

import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args) {

// CharAt method
        String str = "Cydeo";
        //index =     01234

        char firstChar = str.charAt(4);
        char second = str.charAt(2);

        System.out.println(firstChar);
        System.out.println(second);

        System.out.println("--------------------------------------------");

        // Length method

        String sentence = "Java Programming language";

        int lenght = sentence.length();

        System.out.println(lenght);

        int lastIndex = lenght -1;
        System.out.println(lastIndex);

        System.out.println("-----------------------------------------------");

        String s1 ="Wooden Spoon";

        char first = s1.charAt(0);

        int lastIndexNum = s1.length() -1;

        char last = s1.charAt(lastIndexNum);

        System.out.println(first+":" +last);

        System.out.println("-----------------------------------------------");

        //

        String name1 = "Ying";
        String name2 = new String("Ying");

        System.out.println( name1 == name2);

        // If want to compare the value us equals method
        System.out.println(name1.equals(name2));

        System.out.println("------------------------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = input.nextInt();

        System.out.println("Are you a US citizen? yes/no");
        String answer = input.next();

        if(age >= 21 &&  answer.equals("yes") ){ //compare the value by using .equals
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }

        input.close();


    }



}
