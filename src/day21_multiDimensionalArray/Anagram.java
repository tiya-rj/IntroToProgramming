package day21_multiDimensionalArray;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "heart";
        String str2 = "earth";

        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        //System.out.println(Arrays.toString(a1));
        //System.out.println(Arrays.toString(a2));

        if(Arrays.equals(a1,a2)){
            System.out.println("It's anagram.");
        } else System.out.println("It's not anagram.");

        // or boolean isAnagram = Arrays.equal(a1,a2);
        // System.out.println("isAnagram = " + isAnagram);


    }
}
