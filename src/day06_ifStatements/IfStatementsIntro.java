package day06_ifStatements;

public class IfStatementsIntro {

    public static void main(String[] args) {

        int number = -100;

        boolean isPositive = number > 0,
                isNegative = number < 0,
                isZero = number == 0;

        if(isPositive) {
            System.out.println(number + " is positive."); // nothing will print out
        }

        if(isNegative) {
            System.out.println(number + " is negative.");
        }

            if(isZero) {
            System.out.println(number + " is zero.");
        }

        System.out.println("--------------------------------------------------");

            // complete without boolean variable

            int num = 0;

            if (num > 0){
                System.out.println(num + " is positive number.");
            }
            if (num == 0){
                System.out.println(num + " is zero number.");
            }

    }
}
