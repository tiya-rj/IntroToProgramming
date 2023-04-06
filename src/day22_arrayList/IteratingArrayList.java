package day22_arrayList;

import java.util.ArrayList;

public class IteratingArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(2,250);

        System.out.println(nums);

        System.out.println("---Iterate by using For Loop------");

        for (int i = 0; i < nums.size(); i++) {
            int each = nums.get(i); // can assign to variable in case you are gonna use it again.

            System.out.println(each);

        }
        System.out.println("-------reverse-------------------------");

        for (int i = nums.size() - 1; i >= 0; i--) {
            int each = nums.get(i);

            System.out.println(each);

        }
        System.out.println("-----for each loop----------");

        for (Integer each : nums) {

            System.out.println(each);

        }
    }
}
