package day21_multiDimensionalArray;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {

        int[] old_array = {1,2,3,4,5};
        int element = 6; // want to add 6 in array to make {1,2,3,4,5,6}

        //need to create new array to have enough capacity
        //int[] new_array = new int[old_array.length+1];
        int[] new_array = Arrays.copyOf(old_array,old_array.length+1);

        new_array[new_array.length-1] = element; // put the element to the last index

        System.out.println(Arrays.toString(new_array));

        System.out.println("-----let's use the method--------");

        int[]nums = {1,2,3,4};
        nums = ArraysUtility.addElement(nums,5);
        System.out.println(Arrays.toString(nums));

    }
}
