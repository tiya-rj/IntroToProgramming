package day23_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        System.out.println("-----add all method--------");

        ArrayList<Integer> prices = new ArrayList<>();
        prices.add(10);
        prices.add(20);
        prices.add(30);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        nums.addAll(prices);
        System.out.println(nums);

        nums.addAll(1,prices);
        System.out.println(nums);

        System.out.println("----as list method-----------");

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(75,80,90));
        System.out.println("scores are " +scores);

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ying","mai","ya"));
        System.out.println(names);

        names.addAll(1,Arrays.asList("Eye","August"));//insert new elements in specific index
        System.out.println(names);

        Integer[] numbers = {1,2,3,4};

        ArrayList<Integer> numss = new ArrayList<>(Arrays.asList(numbers));// adding non-primitive has to pass as collection
        //numss.addAll(Arrays.asList(numbers));
        System.out.println(numss);

        System.out.println("-----containAll method--------");

        ArrayList<String> employee = new ArrayList<>();
        employee.addAll(Arrays.asList("Lin","Nami","Wawa"));

        System.out.println(employee);
        boolean hasNami = employee.contains("Nami");
        boolean hasEveryone = employee.containsAll(Arrays.asList("Wawa","Lin","Nami")); //order doesn't matter

        System.out.println(hasNami);
        System.out.println(hasEveryone);

        System.out.println("--------removeAll method---------");

        ArrayList<Integer> grade = new ArrayList<>();
        grade.addAll(Arrays.asList(10,20,30,40,10,10,20,20));
        //want to remove all 10 and 20
        grade.removeAll(Arrays.asList(10,20));
        System.out.println(grade);

        System.out.println("---------retainAll  method-------");
        ArrayList<String> pets = new ArrayList<>();
        pets.addAll(Arrays.asList("dog","cat", "bird","elephant","Aligator"));
        pets.retainAll(Arrays.asList("dog","cat")); //just keep these
        System.out.println(pets);

    }
}
