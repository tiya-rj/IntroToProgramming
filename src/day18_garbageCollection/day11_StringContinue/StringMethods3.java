package day18_garbageCollection.day11_StringContinue;

public class StringMethods3 {

    public static void main(String[] args) {

        //isEmpty
        String word ="Miya";

        boolean r1 = word.isEmpty(); // if it's empty, it will return true.

        System.out.println(r1);

        System.out.println("------------------------------------------------");

        //isBlank
        String str = "              ";

        boolean r2 = str.isEmpty();
        boolean r3 = str.isBlank();

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("------------------------------------------------");

        //equals ==> check ig two string has the same text. Case sensitive.
        String no1 = "Miya";
        String no2 = new String("Miya");

        System.out.println(no1==no2);
        System.out.println(no1.equals(no2));

        // to ignore the case sensitivity use equalIgnoreCase
        String no3 = new String("miya");
        System.out.println(no2.equalsIgnoreCase(no3));

        System.out.println("------------------------------------------------");

        //contain ==>verify if this string include in another string. Case sensitive.
        String first = "I love Miya";
        System.out.println(first.contains("love"));

        // to ignore the case sensitivity, use toLowerCase() or toUpperCase()
        System.out.println(first.toUpperCase().contains("LOVE"));

        System.out.println("------------------------------------------------");

        //startsWith() and endWith()
        String wo1 = "i am from Thailand";

        System.out.println("wo1.startsWith(\"I\") = " + wo1.startsWith("I"));
        System.out.println("wo1.endsWith(\"d\") = " + wo1.endsWith("d"));

        System.out.println("-------------------------------------------");

        String email = "CydeoSchool@gmail.com";

        boolean isGmail = email.endsWith("gmail.com");

        boolean isYahoo = email.endsWith("yahoo.com");

        boolean isHotMail = email.endsWith("hotmail.com");

        System.out.println("isGmail = " + isGmail);
        System.out.println("isYahoo = " + isYahoo);
        System.out.println("isHotMail = " + isHotMail);





    }
}
