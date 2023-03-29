package day13_customMethods;

public class ReturnMethodIntro {

    public static void main(String[] args) {

        int total = sum(10,20);
        //int test  = square(3);
        System.out.println(square(3));

        System.out.println(cube(5));

    }

    public static int sum(int n1, int n2){

        int result = n1 + n2;

        return result;

    }

    public static int square(int num){

        int square = num * num;
        return square;
    }

    public static int cube(int no){
        int cube = square(no)*no;  //no*no*no; // to calculate cube , have to do square first. So in this case it's duplicate. We can call square method to use.
        return cube;


    }
}
