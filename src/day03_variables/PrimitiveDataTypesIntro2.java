package day03_variables;

public class PrimitiveDataTypesIntro2 {

    public static void main(String[] args) {

        //DateType variableName = Date; //always follow this syntax

        char a = '@';
        char b = '!';
        char c = '1';
        //char ab = 'ab'; // error bc char is only to contain one character

        System.out.println(a);

        System.out.println("---------------------------------");

        char ch1 = 'A';
        char ch2 = 65; //65 is ascii table number for A
        System.out.println(ch1);
        System.out.println(ch2); // result is A

        System.out.println("---------------------------------");

        char ch3 = 9000;
        System.out.println(ch3); // result is keyboard emoticon

        System.out.println("---------------------------------");

        //char ch4 = -100; // cannot be lower than 0

        int sum = 'A' + 'B';
        System.out.println(sum); // result is 131 as value of A&B in ASCII table

        System.out.println("---------------------------------");

        //boolean r1 = 123;
        //boolean r2 = 2.5;
        //boolean r3 = "Java";
        boolean r4 = true;
        boolean r5 = false;

        boolean r6 = 100 > 10; // true
        boolean r7 = 0 < -1; // false

        System.out.println(r6);
        System.out.println(r7);


    }
}
