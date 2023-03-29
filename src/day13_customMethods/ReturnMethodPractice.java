package day13_customMethods;

public class ReturnMethodPractice {

    //odd or even


    public static void main(String[] args) {

        System.out.println(isOdd(5));
        // or we can create if block
        int num = 201;
        if (isEven(num)){
            System.out.println("it's even");
        } else {
            System.out.println("it's odd");
        }

    }

    public static boolean isOdd(int num){

        boolean isOdd = num % 2 != 0; // or return (num % 2 != 0)? true : false;
        return isOdd;
    }
    public static boolean isEven (int num){

        return !isOdd(num);
    }
}
