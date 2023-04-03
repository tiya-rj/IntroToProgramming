package day22_arrayList;

public class WrapperClassesIntro {

    public static void main(String[] args) {


        int a1 = 10;
        Integer a2 = 10;

        System.out.println("------------------------");
        int b1 = 100;
        Integer b2 = b1; // auto boxing happened behind //has to be the same wrapper class name

        char ch = 'A';
        Character ch2 = ch;

        double d1 = 5.5;
        Double d2 = d1;

        // when converse back, has to be the same class name too
    }
}
