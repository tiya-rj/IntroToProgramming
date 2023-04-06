package day23_ArrayListContinue;

import java.util.ArrayList;

public class FirstUniqueElement {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(1);
        list.add(5);

        System.out.println(list);

        for (Integer element : list) {

            int frequency = 0;
            for (Integer each : list) {
                if(each == element){
                    frequency++;
        }

            }
            if (frequency == 1){
                System.out.println(element);
                break; // bc we want only one unique

            }

        }
    }
}
