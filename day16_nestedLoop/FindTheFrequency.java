package day16_nestedLoop;

public class FindTheFrequency {

    public static void main(String[] args) {

        String str = "acbacbc";
        char ch = 'c';

        int count = 0;

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str

            if( str.charAt(i) == ch ){
                // if the character of the string is equal to the given character, it means the given character has appeared in the string
                count++;
            }

        }


        System.out.println(count);

        System.out.println("--------------------------------------------------");



        String sentence = "java JAVA jAvA JAva";
        String word = "Java";

        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        int c = 0;

        while(sentence.contains(word)){
            c++;
            sentence = sentence.replaceFirst(word, ""); //if we don't use replace after it counts, it will be infinite bc it all java.
        }


        System.out.println(c);

    }





}



/*
 2. write a program that can return the frequency of a character from a string
        	Ex:
        		str = "aaabbbbccccc"
        		ch = 'c'
		     output:
		     	5

		     	3.  Write a program that can return the frequency of the word java from a sentence
		    Ex:
		        sentence = "java JAVA jAvA JAva"
		    output:
		        4
        "Java Java Java Java"; //count = 0;
        " Java Java Java" // count = 1
        " Java Java" // count = 2;
        " Java"    // count = 3
        " "       // count = 4
 */

