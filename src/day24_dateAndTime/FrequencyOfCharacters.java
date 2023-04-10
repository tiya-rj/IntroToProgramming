package day24_dateAndTime;


import java.util.Arrays;
import java.util.Collections;
public class FrequencyOfCharacters {

        public static void main(String[] args) {

            String str = "aaabbbbccccc";

            String result = "";    //a3b4c5

            for (String each : str.split("")) {
            // for String you have to convert it to collection type to find the frequency by using split method
                int frequency = Collections.frequency(  Arrays.asList( str.split("") )   , each );
            // to advoid duplication . what is already add, don't add
                if(!result.contains(each)){
                    result += each + frequency; //to print out with letter + number a3b4c5
                }

            }


            System.out.println(result);


        }


    }

