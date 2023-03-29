package day19_array;

import java.util.Arrays;

public class ArrayPractices {

    public static void main(String[] args) {

        String[] myGroup = new String[5];

        myGroup[0] = "Jo";
        myGroup[myGroup.length - 1] = "Jammy";
        myGroup[2] = "Summer";
        myGroup[1] = "Bumble";
        myGroup[3] = "Kim";

        System.out.println(Arrays.toString(myGroup));

        myGroup[1] = "Mia";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("------------------------------------");

        for (int i = myGroup.length - 1; i >= 0; i--) {
            System.out.println(myGroup[i]); //reverse printout


        }


        int[] arr1 = new int[100];

        /*
        for (int i = 0, j = 1; i < arr1.length; i++, j++) {
            arr1[i] = j;
        }
         */

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;  //without signing in J variable
        }

        System.out.println("arr1 = " + Arrays.toString(arr1));


        System.out.println("---------------------------------------------------------");

        int[] arr2 = new int[100]; //index: 0 ~ 99

        /*
        for (int i = 0 , j = 100; i < arr2.length; i++, j--) {
            arr2[i] = j;
        }
*/

        for (int i = 0; i < arr2.length; i++) { // i ia index numbers
            arr2[i] = 100 - i;
        }


        System.out.println("arr2 = " + Arrays.toString(arr2));


    }

}







