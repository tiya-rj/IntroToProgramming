package day11_StringContinue;

public class StringMethods1 {

    public static void main(String[] args) {
        //String CANNOT be modified so these method will help to modify it.

        String str1 = "CYDEO SCHOOL";
        str1 = str1.toLowerCase(); // "cydeo school" to update the value, have to resign back to variable itself.

        System.out.println(str1);

        System.out.println("-----------------------------------------------");

        String str2 ="java";
        String str3 = str2.toUpperCase(); // if you want to keep the lowercase, can sign it to new variable

        System.out.println(str3);

        System.out.println("-----------------------------------------------");

        String str4 = "    Tiya Jannell  ";
        str4 = str4.trim(); //create the new string exclude the white space

        System.out.println(str4);

        System.out.println("-----------------------------------------------");

        String sentence = "Today is Tuesday, I want to have Java chip frappuccino";
        int index1 = sentence.indexOf('e');

        System.out.println(index1);

        int index2 = sentence.indexOf("e "); // in case we want to find duplicate letter. the next 'e'. So have to be specified ("e " e with white space.)

        System.out.println(index2);

        int index3 = sentence.indexOf("ip"); // add more.. to be unique

        System.out.println(index3);

        System.out.println(sentence.lastIndexOf('n'));


    }
}
