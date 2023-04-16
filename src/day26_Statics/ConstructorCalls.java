package day26_Statics;

public class ConstructorCalls {

    public ConstructorCalls(){
        //this();// constructor CANNOT call or contain constructor itself
        System.out.println(("Default constructor"));
    }

    public ConstructorCalls(int a){
        //ConstructorCalls(); // cannot call constructor by its name in another constructor
        this(); //call constructor have to use this();
        System.out.println("Constructor with int argument.");
        //this(); //constructor has to be called at first at all time. line 12
    }

    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument");
    }

    public ConstructorCalls(String c){
        this(2.5);
        //this(); //one constructor can call only one constructor
        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {

    }

    public static void method1(){
        System.out.println("Method 1");
    }

    public static void method2(){
        method1(); // in method. you can call method name in another method
        System.out.println("Method 2");
    }
}
