package day27_accessModifiers;

public class StaticBlock {

    public StaticBlock(){
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        System.out.println("Main Method");

        new StaticBlock();
        new StaticBlock();
        new StaticBlock();
    }

    static {
        System.out.println("Static Block");
    }//static block get execucute first and only one time. Then the rest get excecute from top to bottom

}
