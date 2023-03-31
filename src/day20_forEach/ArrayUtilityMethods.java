package day20_forEach;

import java.util.Arrays;

public class ArrayUtilityMethods {

    public static void main(String[] args) {

        //.toString()
        int[]score = {70,100,80,90,65};

        System.out.println(Arrays.toString(score));

        String result = Arrays.toString(score);
        //bc its return with string result, you can sign it to String variable

        System.out.println(result);

        System.out.println("---------------------------------");

        //.equals()
        char[] a1 = {'a','c','g'};
        char[] a2 = {'a','g','f'};

        boolean check = Arrays.equals(a1,a2);
        System.out.println(check);
        //or System.out.println(Arrays.equals(a1,a2));

        System.out.println("----------------------------------");

        //.sort() from small to large
        int[] nums = {9,10,100,89,-3,0};

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
        //finding min/max number by using .sort()
        System.out.println("Minimun num is: " + nums[0]);
        System.out.println("Maximun num is: " + nums[nums.length-1]);

        System.out.println("----------------------------------");

        //.copyOf() start copy from the first aliment to whatever number you gave
        String[] name = {"miya","tiya","mike"};
        String[] name2 = Arrays.copyOf(name,3);// number can be less or more. if more --> 0 will be given by default.

        System.out.println(Arrays.toString(name2));

        int[] n1 = {1,2,3};
        int[] n2 = {4,5,6,7,8,9};

        int[] n3 = Arrays.copyOf(n1,n1.length + n2.length);// [1,2,3,0,0,0,0,0,0]

        for (int i = 0,j = n1.length; i < n2.length; i++,j++) {
            n3[j] = n2[i];
        }

        System.out.println(Arrays.toString(n3));

        System.out.println("-------------------------------------");


        //.copyOfRange() can specify where you want to start to copy
        char[] ch = {'A','B','C','D','E'};
        //index =     0   1   2   3   4

        char[] copy = Arrays.copyOfRange(ch,2,4);//exclude ending index
        System.out.println(Arrays.toString(copy));

        char[] copy2 = Arrays.copyOfRange(ch,2,ch.length); //if you want til the last index
        System.out.println(Arrays.toString(copy2));





    }
}
