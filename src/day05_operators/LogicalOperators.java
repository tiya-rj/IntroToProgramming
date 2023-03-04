package day05_operators;

public class LogicalOperators {

    public static void main(String[] args) {
         // && ==> logical AND ==> will return true if all logical are true
        // || ==> logical OR ==> will return false if all are false
        // ! ==> logical NOT ==> will return the opposite

        double salary = 60000;
        int creditScore = 650;

        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650; // true
                                           //true            //true
        System.out.println(eligibleForLoan);

        int age= 42 ;
        boolean eligibleForLoan1 = salary >= 90000 && creditScore >= 650 && age >=18 ; // false
                                            //false            //true
        System.out.println(eligibleForLoan1);


        System.out.println("-----------------------------------------------");

        age = 18;
        String country = "USA";

        boolean eligibleVote = age >= 18 && country == "USA"; // true
        System.out.println(eligibleVote);



        System.out.println("------------------------------------------------");
        // ||
        String answer = "Maybe";
        boolean validAnswer = answer == "yes" || answer == "no"; //false
                                    //false         //false
        System.out.println(validAnswer);

        String answer1 = "yes";
        boolean validAnswer1 = answer1 == "yes" || answer1 == "no"; //true
                                    //true             //false
        System.out.println(validAnswer1);

        char grade = 'B';
        boolean passedTheExam = grade == 'A' || grade == 'B' || grade =='C'; //true
                                    //false       //true         //false
        System.out.println(passedTheExam);


        System.out.println("------------------------------------------------");
        // !
        System.out.println(!true); //false

        String a = "yes";
        boolean yes = a == "yes"; //true
        boolean no = !yes; // false

        System.out.println("yes = " + yes);
        System.out.println("no = " + no);

        int score = 65;
        boolean passed = score >= 60;
        boolean falied = !passed;
        System.out.println("passed = " + passed);
        System.out.println("falied = " + falied);

        System.out.println("---------------------------------------------------");

        System.out.println(true ==!false && false == !true && true != !true);
                                //true           true             true


    }
}
