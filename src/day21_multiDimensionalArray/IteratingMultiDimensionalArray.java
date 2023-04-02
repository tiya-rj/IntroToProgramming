package day21_multiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {

        int[][] all = {{10,20,20},{1,2,3,4,5},{34,67,54}};

        for (int i = 0; i < all.length ; i++) { // i: index number of array

            System.out.println(Arrays.toString(all[i]));

            int[] each = all[i];

            for (int j = 0; j < each.length; j++) { // j: index number of elements in each array
                int eachElement = each[j];

                System.out.println(eachElement);

            }
        }

        System.out.println("--------------------------------");

        // using for each loop

        for (int[] each : all) {

            System.out.println(Arrays.toString(each));

            for (int eachElement : each) {
                System.out.println(eachElement);
            }

        }

        System.out.println("---------------------------------");
        //shortcut for iterating

        //for loop from last index in the reverse order
        for (int i = all.length - 1; i >= 0; i--) {
            for (int j = all[i].length - 1; j >= 0; j--) {
                System.out.println(all[i][j]);


            }

        }
        System.out.println("-----------------------------");

        //for each
        for (int[] each : all) {
            for (int eachElement : each) {
                System.out.println(eachElement);

            }

        }
    }
}
