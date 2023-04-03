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

// quizzes
        int[] intarr= {15,30,45,60,75};
        intarr[2] = intarr[4];
        intarr[4] = 90;
        System.out.println(Arrays.toString(intarr));

        String[] planet = {"mercury","venus","earth","mars"};
        int x = planet.length;
        int y = planet[1].length();
        System.out.println(x+" "+y);

        int[] arr = {1,2,3,4};
        int i = 0;
        do {
            System.out.println(arr[i]+" ");
            i++;
        } while (i<arr.length-1);
    }
}
