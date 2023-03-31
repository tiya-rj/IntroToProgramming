package day20_forEach;

import java.util.Arrays;
import Utilities.ArraysUtility;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};

        int[] arr3 = new int[arr1.length+arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));

        System.out.println("-----------------------------------");


        int[] a1 = {10,20,30};
                int[] a2= {40,50,60};

                int[] a3 = ArraysUtility.merge(a1,a2); //how to call merge method from utilities. Don't forget to import too.

        System.out.println(Arrays.toString(a3));

    }


}
