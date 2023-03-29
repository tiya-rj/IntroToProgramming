package day14_forLoop;

public class StringReverse {

    public static void main(String[] args) {

        String str = "Java";

        String reverse = "";

        for (int i = str.length() -1; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        System.out.println(reverse);

        System.out.println("------------------------------------------------");




        String name ="lgknrmlkgnrlbgmrmnlkmbl;rmbglr;m";
        String result = new_name(name);

        System.out.println(result);
    }

    public static String new_name(String str){
        String new_name = "";

        for (int i = str.length() -1; i >= 0; i--) {
            new_name += str.charAt(i);
        }
        return new_name;

    }
}
