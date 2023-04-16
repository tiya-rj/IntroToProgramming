package day26_Statics;

public class ConstructorCalls2 {

    public ConstructorCalls2(){
        System.out.println("Default");
    }

    public ConstructorCalls2(int a){
        this();//calling default constructor
        System.out.println("int arg");
    }

    public ConstructorCalls2(String a){
        this(10);
        System.out.println("String arg");
    }

    public static void main(String[] args) { // this step call create object

        ConstructorCalls2 obj1 = new ConstructorCalls2();

        System.out.println("---------benefit of having more constructors is more option to create objects --------------------");

        ConstructorCalls2 obj2 = new ConstructorCalls2(10);

        System.out.println("-------printed 3 answer bc the 1st constructor linked to 2nd and 3rd constructor called chain constructor----------------");

        ConstructorCalls2 obj3 = new ConstructorCalls2("java");
    }
}
