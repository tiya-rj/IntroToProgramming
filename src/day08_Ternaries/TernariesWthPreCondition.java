package day08_Ternaries;

public class TernariesWthPreCondition {

    public static void main(String[] args) {

        int score = 130;

        /*
        String result = "";

        if (score >= 0 && score <= 100) {

            if (score >= 60){
                result = "Passed";
            }else {
                result = "Failed";
            }
        }else {
            result = "Invalid";
        }
        System.out.println(result);

         */


        String result = (score >= 0 && score <= 100) ?
                (score >= 60) ? "Passed" : "Failed" : "Invalid";
        System.out.println(result);

        System.out.println("---------------------------------------------");

        //nested ternaries

        int n = 10;

        String day = (n>=1 && n<=7)?
                (n ==1)?"Monday" : (n==2)?"Tuesday":(n==3)?"Wednesday" :(n==4)? "Thursday" :(n==5)?"Friday" :(n==6)?"Saturday" : "Sunday"

                : "No such a day";
        System.out.println(day);

        System.out.println("---------------------------------------------");

        // mixing ternaries and if statement
        // more readable

        int point = 90;

        String grade ="";

        if (point >= 0 && point <= 100){

            grade = (point>=90)?"A" :(point>= 80)?"B" :(point >=70)?"C" :(point >=60)?"D" :"F";

        } else {
            grade = "Invalid";
        }
        System.out.println(grade);


    }





}
