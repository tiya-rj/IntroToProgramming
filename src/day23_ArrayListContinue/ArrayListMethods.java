package day23_ArrayListContinue;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {
        System.out.println("----update method-----");

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("egg");
        groceryList.add("milk");
        groceryList.add("chips");

        groceryList.set(2,"water");

        System.out.println(groceryList);

        System.out.println("-----remove String--------------");

        //can remove by object or index
        groceryList.remove(0);
        System.out.println(groceryList);

        System.out.println("-------remove Integer--");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);

        nums.remove(Integer.valueOf(10)); //remove by object in Integer has to use this command (wrapper class)
        System.out.println(nums);

        System.out.println("--------clear method----------");
        nums.clear();
        System.out.println(nums);

        System.out.println("----index of method---------");

        ArrayList<String> student = new ArrayList<>();
        student.add("Bee");
        student.add("Mika");
        student.add("Leo");
        student.add("Bruno");
        student.add("Mika");

        System.out.println(student.indexOf("Bee"));

        System.out.println("-----last index of method-------");
        System.out.println(student.lastIndexOf("Mika")); //4 bc checking the last index of Mika


        System.out.println("--------contain method-------------");
        boolean hasTiya = student.contains("Tiya");
        System.out.println("hasTiya : " + hasTiya);

        System.out.println("---------equal method------");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        list1.add(10);

        System.out.println(list1.equals(list2));

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(10);
        l2.add(10);
        System.out.println(l1.equals(l2));

        System.out.println("-----isEmpty method---------");
        System.out.println(l1);
        l1.clear();
        System.out.println(l1.isEmpty());



    }
}
