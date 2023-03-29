package day14_forLoop;

public class MethodOverloadingPractice {

    public static void main(String[] args) {

        System.out.println( sum(10,20)); //what "sum" will get excecuced depends on how many integer you put.

        System.out.println(sum(10,20,30)); // cannot be decimal number but you can create function to return decimal number by using double.
    }

    public static int sum(int num1, int num2){

        return num1 + num2;

    }
    public static int sum(int num1, int num2, int num3){

        return sum(num1, num2) + num3;

    }


}
