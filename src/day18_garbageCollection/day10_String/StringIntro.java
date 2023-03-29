package day18_garbageCollection.day10_String;

import java.util.Scanner;

public class StringIntro {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "Java"; // String and System class will import automatically. don;t have to call it lik the Scanner class.
        //Java object is immutable (unchangeable, cannot modify)

        System.out.println();
        input.close();

        System.out.println("----------------------------");


        String s1 = "Cat";
        String s2 = "Dog";

        String s3 = "Cat";
        String s4 = "Cat";

        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);

        System.out.println("----------------------------");

        String str1 = new String("Java"); // Creates two objects: 1. String pool, 2. in heap (outside string)
        String str2 = new String("Java");

        System.out.println( str1 == str2);


        System.out.println("----------------------------");

        String t1 = "Python";
        String t2 = new String("Python");
        String t3 = new String("Python");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
// one in the String pool. Two outside the String pool in the heap.

        System.out.println(t1 == t2);
        System.out.println(t3 == t2);




    }

}
/*
 2 ways of creating String class ( by String literal and by new keyword)
  By String literal ==> String str1 = "Java";
                    ==> String str 2 = "Java";
        If there is the same value of String, it will be stored in the heap only one in the String pool.
  By new keyword ==> String str1 = new String ("Java");
                 ==> String str1 = new String ("Java");
        NOT the same object even though there is the same value of String but TWO object will be created in the heap. 1 in the String pool 2. in the heap
 */