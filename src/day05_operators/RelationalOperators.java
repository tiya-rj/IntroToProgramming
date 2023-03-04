package day05_operators;

public class RelationalOperators {

    public static void main(String[] args) {

        //relational operators return Boolean (true/false)
        // >, <, =>, <= these operators use for only number
        // ==, != can use with string of text & boolean


        int a = 1000;
        int b = 1000;

        // System.out.println(a > b); // or can create Boolean operator like below
        boolean aIsGreater = a > b;
        System.out.println( aIsGreater);

        System.out.println("--------------------------------------------------------");

        int age = 21;
        boolean eligibleoBouAlcohol = age >= 21;
        System.out.println(eligibleoBouAlcohol);

        System.out.println("---------------------------------------------------------");

        int score = 48;
        boolean failed = score < 60;
        System.out.println(failed);



        
    }
}
