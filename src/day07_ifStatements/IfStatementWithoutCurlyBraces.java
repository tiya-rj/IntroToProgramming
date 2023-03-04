package day07_ifStatements;

public class IfStatementWithoutCurlyBraces {

    public static void main(String[] args) {
        int age = 32;

        if (age >=21){
            System.out.println("Eligible");
        }else {
            System.out.println("Not Eligible");
        }
        System.out.println("---------------------------------------------------------");

        if (age >= 21) System.out.println("Eligible"); // without the curly braces if block can carry only ONE statement
        else System.out.println("Not Eligible");
        // good to know but it is not a good habit

        System.out.println("---------------------------------------------------------");

        int day = 2;

        if (day ==1) System.out.println("Monday");
        else if (day == 2) System.out.println("Tuesday");
        else if (day == 3) System.out.println("Wednesday");
        else System.out.println("Thursday");
    }
}
