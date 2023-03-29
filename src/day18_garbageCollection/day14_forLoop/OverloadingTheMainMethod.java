package day18_garbageCollection.day14_forLoop;

public class OverloadingTheMainMethod {

    public static void main(String[] args) {
        System.out.println("A"); //first method will run first (real main method)
        main(25); //B
        main(2.05); //C
        main(true);//D


    }

    public static void main(int  args){ //these are fake main method. if you want to use it -> call it in main method --> main() and it will get excecued from top to bottom
        System.out.println("B");
    }
    public static void main(double args){
        System.out.println("C");
    }
    public static void main(boolean args){
        System.out.println("D");
    }
}
