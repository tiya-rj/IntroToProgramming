package day22_arrayList;

public class WrapperClassMethod {

    public static void main(String[] args) {

        System.out.println("------String to Integer----------------");

        String str = "20";

        System.out.println(str+1);

        Integer num = Integer.parseInt(str); //return primitive type, converse String to primitive value
        System.out.println(num+1);

        Integer num1= Integer.valueOf(str);//return wrapper class object, convert String to class value
        System.out.println(num1);

        System.out.println("-----------String to double------------------");

        String s = "20.5";

        Double d = Double.parseDouble(s);
        System.out.println(s);

        System.out.println("--------String to Boolean------------------");

        String x = "true";
        Boolean.parseBoolean(x);
        System.out.println(x);

        System.out.println("-----------check it with ASCII table------------------");

        //char ch = '1';
        //char ch = 'A';
        char ch = '@';
        boolean isDigit = Character.isDigit(ch);
        boolean isLetter = Character.isLetter(ch);
        boolean isLower = Character.isLowerCase(ch);
        boolean isUpper = Character.isUpperCase(ch);
        boolean isLetterOrDigit = !Character.isLetterOrDigit(ch); //opposit of letter,digit means spacial character

        System.out.println("isDigit = " + isDigit);
        System.out.println("isLetter = " + isLetter);
        System.out.println("isUpper = " + isUpper);
        System.out.println("isLower = " + isLower);
        System.out.println("isLetterOrDigit = " + isLetterOrDigit);

        System.out.println("----------find sum of String----------------");

        String string1 = "a1b2c3d4e5";

        int sum = 0;

        for (char each : string1.toCharArray()) {
            if(Character.isDigit(each)){
               sum += Integer.parseInt(""+each);//converse char to number but not number from Ascii


            }

        }
        System.out.println(sum);

    }
}
