package day23_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtilities {

    public static void main(String[] args) {

        System.out.println("------min max------------------");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("---------------sort-----------------");
        ArrayList<String > pets = new ArrayList<>();
        pets.addAll(Arrays.asList("dog", "cat","bird","fish"));

        Collections.sort(pets);
        System.out.println(pets);

        System.out.println("------------reverse----------------");
        Collections.reverse(pets);
        System.out.println(pets);

        System.out.println("----------------swap--------------");
        Collections.swap(pets,0,1); //pets.size()-1 for finding last element number
        System.out.println(pets);

    }
}
