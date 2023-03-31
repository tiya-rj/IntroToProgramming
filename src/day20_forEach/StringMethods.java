package day20_forEach;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Dara Academy";

        char[] ch = str.replace(" ","").toCharArray();
        //will return every index of String including white space.So have to use replace method too.

        System.out.println(Arrays.toString(ch));

        System.out.println("------------------------------------");

        String str2 = "Today is Thursday";
        String[] words = str2.split(" "); // split by white space
        // if spit by using word that word will be excluded.
        System.out.println(Arrays.toString(words));


        System.out.println("-------------------------------------");

        //reverse the sentence
        String sentence = "I love you";

        String[] arr = ArraysUtility.reverse(sentence.split(" "));
        System.out.println(Arrays.toString(arr));

        String reversed = "";
        for (int i = 0; i < arr.length; i++) {
            reversed += arr[i] + " ";

        }
        System.out.println(reversed);

    }
}
