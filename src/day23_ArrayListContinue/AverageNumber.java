package day23_ArrayListContinue;

import java.util.ArrayList;

public class AverageNumber {

    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList<>();
        List.add(20);
        List.add(30);
        List.add(40);
        List.add(50);
        List.add(60);
        List.add(70);

        System.out.println(List);

        int sum = 0;

        for (Integer each : List) {
            sum += each;

        }
        double average = sum / (double)List.size(); //case it to double to be able to get decimal number

        System.out.println("average = " + average);
    }
}
