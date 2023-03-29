package day18_garbageCollection.day11_StringContinue;

public class StringMethods2 {

    public static void main(String[] args) {

        // replace will replace al the matching ones

        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";

        String sentence1 = sentence.replace("Python", "Java");
        // or resign back to sentence

        System.out.println(sentence1);

        System.out.println("-------------------------------------------------");

        String word = "Java";
        word = word.replace('a','e');

        System.out.println(word);

        System.out.println("------------------------------------");

        //replacefirst with replace only the first matching ones

        String word2 = "I love Java, Java is good";
        word2 = word2.replaceFirst("Java","Miya");

        System.out.println(word2);

        System.out.println("------------------------------------");

        String word3 =  "I love Java programming";
                      // 012345678910
        word3= word3.substring(7,11); // or (7,10+1)

        System.out.println(word3);

        System.out.println("----------------------");

        String email = "Miya@gmail.com";
        // find the index number of domain
        int beginning = email.indexOf('@') + 1;
        int ending = email.lastIndexOf('.');

        String domain = email.substring(beginning,ending);

        System.out.println(domain);

        System.out.println("--------------------------------------");

        // if want to get index until the last. you can just put beginning. no ending needed.
        String love ="Miya a Cockapoo";

        String love1 = love.substring(7);

        System.out.println(love1);

        System.out.println("------------------------------------------");

        String str = "Sweet Sweat";
        String str2 = str.trim().charAt(6)+" "+str.indexOf("Sw",1);
        System.out.println(str2);

        System.out.println("-------------------------------------------");

        //repeat

        String mo = "Miya";
        String result = (mo+ "\n") .repeat(10);
        // repeat 10 time and to add the new line
        System.out.println(result);






    }
}
