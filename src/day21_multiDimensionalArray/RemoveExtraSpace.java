package day21_multiDimensionalArray;

import java.util.Arrays;

public class RemoveExtraSpace {

    public static void main(String[] args) {

        String str = "  Hello world     I  love     you   ";

        str = str.trim(); // no need

        String [] word = str.split(" ");

        System.out.println(Arrays.toString(word));// no need

        str = "";

        for (String each : word) {
            if(!each.isEmpty()){
                str += each +" ";
            }

        }
        str = str.trim(); //bc there is extra space after "you"

        System.out.println(str);



    }
}
