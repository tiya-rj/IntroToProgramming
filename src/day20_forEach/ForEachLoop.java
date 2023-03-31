package day20_forEach;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] num = {10, 20, 30, 40};
//for loop :: can ask to run from any index
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);

        }
        System.out.println("---------------------------");

//for each loop :: shorter, easier to print the whole, but cannot be adjusting
        for (int each: num ) {
            System.out.println(each);
        }

    }
}
