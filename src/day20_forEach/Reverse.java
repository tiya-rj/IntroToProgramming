package day20_forEach;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int[] reverse = new int[array.length];

        for (int i = array.length - 1, j =0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        /*if you have to use variable j outside the loop
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverse[j++] = array[i];
         */
        }
        System.out.println(Arrays.toString(reverse));

        System.out.println("--------------------------------");

        int[] nums = {10,20,30};
        nums = ArraysUtility.reverse(nums); //how to call reverse method

        System.out.println(Arrays.toString(nums));

    }
}
