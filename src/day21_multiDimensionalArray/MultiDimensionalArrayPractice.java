package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {

    public static void main(String[] args) {

        String[] group1 = {"Aim","Aum","Aunya","Aoy"}; //4names
        String[] group2 = {"Beem","Boo","Bee"}; //3names
        String[] group3 = {"Cat","Chip","Copper","Cupid","Can"}; //5names
        String[] group4 = {"Dottie","Deem"}; //2names

        String[][] all = {group1,group2,group3,group4};

        for (String[] each : all) {
            for (String eachElement : each) {
                System.out.println(eachElement);
            }
        }

        System.out.println("--------reverse order----------------");

        for (int i = all.length - 1; i >= 0; i--) {
            String[] eachStudent = all[i];
            for (String each : eachStudent) {
                System.out.println(each);
            }

        }

        System.out.println("-----------------------------");
        System.out.println(Arrays.toString(all));
        System.out.println(Arrays.deepToString(all));
    } // note :: .toString() for single dimensional arrays ONLY
    //           .deepToString() for multi dimensional arrays
}
