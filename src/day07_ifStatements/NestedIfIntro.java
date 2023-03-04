package day07_ifStatements;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 95;

        if (score >= 0 && score <= 100){ //if the score is valid

            if (score >= 60){ // if the score is greater or equal to 10
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }
        }else { // if the score is not valid. out of range 1-100
            System.out.println("Invalid Score");
        }

        System.out.println("------------------------------");

        int day = 100;

        if (day>=1 && day <=7){
            if (day == 1){
                System.out.println("Monday");
            }else if (day == 2){
                System.out.println("Tuesday");
            } else if (day ==3) {
                System.out.println("Wednesday");
            } else if (day == 4) {
                System.out.println("Thursday");
            } else if (day == 5) {
                System.out.println("Friday");
            } else if (day == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }

        }else { // if the pre-condition is failed
            System.out.println("Invalid Day");
        }

        System.out.println("----------------------------------------------");

        int floorNumber = 6;

        String result ="Invalid ";

        if (floorNumber >0 && floorNumber <4){
            result = "Floor" + floorNumber + " is selected. Companies: ";

            if (floorNumber == 1){
                result += "Lobby, Verizon, Starbucks";
            } else if (floorNumber == 2) {
                result += "Cybertek, NASA, Intelsat";
            }else {
                result += "Lyft, BofA, Stake House";
            }
        }

        System.out.println(result);




    }
}
