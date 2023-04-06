package day23_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {

    public static void main(String[] args) {

        System.out.println("---------Array to Array list--------");

        String[] arr = {"A","B","C"};
        ArrayList<String > list = new ArrayList<>(Arrays.asList(arr));

        System.out.println(list);

        System.out.println("-------Array List to Array------------");

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("dog","cat"));
        String[] pets = list2.toArray(list2.toArray(new String[0]));//just set it 0 or list2.size()

        System.out.println(Arrays.toString(pets));

    }
}
