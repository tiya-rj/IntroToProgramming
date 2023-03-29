package day19_array;

import java.util.Arrays;

public class Alphabets {

    public static void main(String[] args) {

        char[] ascending = new char[26];
        char[] descending = new char [26]; //both have the same index number so they can use the same for loop.

        for (int i = 0, j = 'A', k = 'Z'; i < ascending.length; i++ ,j ++, k--) {
            ascending[i] = (char)j;
            descending[i] = (char) k;
            

        }
        System.out.println(Arrays.toString(ascending));
        System.out.println(Arrays.toString(descending));

    }
}



/*
        3. Create a char array and store all the alphabet letters in ascending order

        4. Create a char array and store all the alphabet letters in descending order

 */