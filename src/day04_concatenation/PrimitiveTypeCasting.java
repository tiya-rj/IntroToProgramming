package day04_concatenation;

public class PrimitiveTypeCasting {

    public static void main(String[] args) {

        //-----------Implicit Casting--(small to large)---------
        byte a = 15;
        short b = a; // short b = (short)a
        System.out.println(b);

        int c = a;

        long d = 3000L;

        float f = d;
        // small to large can be done by itself

        System.out.println("------------------------------------------------");

        //--------------Explicit casting -----large to small-------------
        int x = 100;
        byte y = (byte)x;

        float z = 20.8F;
        short q = (short)z; //z=20.8 but q will be 20 because short won't take decimal number
        System.out.println(q);

        System.out.println("------------------------------------------------------");

        // if
        int num = 500;
        byte result = (byte)num;
        System.out.println(result); // byte cannot take 500. it will give you some negative number

        int r = 50000;
        short t = (short)r;
        System.out.println(t);

        // explicit casting has to be done manually


    }

}
