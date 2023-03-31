package day20_forEach;

import java.util.Arrays;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        int[] num = {1,2,3,4,5,6,7,8,9}; //finding odd num

        for (int each :num) {

            if(each %2 !=0){
                System.out.println(each);
            }

        }
        System.out.println("----------------------------");

        int[] num2 = {100,20,30,1,500,5}; //finding min/max without using .sort()

        int max = num2[0];
        int min = num2[0];

        for (int each : num2) {

            if(each > max){
                max = each;
            }

            if(each < min){
                min = each;
            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("--------------------------------");

        int[] a1 = {10,20,30,40}; //merging
        int[] a2 = {0,2,4,6};

        int[] a3 = new int[a1.length + a2.length];

        int k = 0;

        for (int each : a1) {
            a3[k++] = each;
        }

        for (int each : a2) {
            a3[k++] = each;
        }

        System.out.println(Arrays.toString(a3));

        System.out.println("-----------------------------------");

        String[] name = {"Miya Jann", "Mama Jann", "Dada Jann"}; //doing intial

        for (String each : name) {
            System.out.println(each.charAt(0)+ "." + each.charAt(each.lastIndexOf(" ")+1));

        }


    }
}
