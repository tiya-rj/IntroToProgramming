package day08_Ternaries;

public class TernariesIntro {

    public static void main(String[] args) {

        int score = 85;
        String result = "";

        if (score >= 68){
            result = "Passed";
        }else {
            result =" failed";
        }
        System.out.println(result);

        System.out.println("---------------------------------");

        // Do in Ternary way

        String result2 = (score >= 68)? "Passed" : "Failed";
        System.out.println(result2);
    }
}
