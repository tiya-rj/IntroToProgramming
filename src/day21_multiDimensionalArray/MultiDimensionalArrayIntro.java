package day21_multiDimensionalArray;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        int[] a1 = {10,20,20};
        int[] a2 = {1,2,3,4,5};
        int[] a3 = {34,67,54};

        int[][] all = {{10,20,20},{1,2,3,4,5},{34,67,54}};
        // index            0          1          2
        System.out.println(all.length); // base on number of element

        System.out.println(Arrays.toString((all[1])));
        System.out.println(all[0][1]);
    }
}
