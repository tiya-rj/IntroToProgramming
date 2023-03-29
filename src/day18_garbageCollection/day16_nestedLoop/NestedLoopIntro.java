package day18_garbageCollection.day16_nestedLoop;

public class NestedLoopIntro {

    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }


        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        System.out.println("----------------------------------------------------");
        // same case by using nested loop

        for (int i = 0; i < 5; i++) { //i : 0

            for (int j = 0; j < 5; j++) {
                System.out.println("Wooden Spoon");
            }

        }

        System.out.println("----------------------------------------------------");

        String str = "aaabbccccddeeeeff";

        String result = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                count++;

            }
        }
            if(count ==2 && !result.contains(""+ch)){ // find the character that appeared twice and print it out without duplicate it. --> bdf
                result += ch;

            }


        }
        System.out.println(result);


    }
}
