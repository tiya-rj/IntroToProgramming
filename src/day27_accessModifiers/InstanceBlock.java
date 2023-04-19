package day27_accessModifiers;


public class InstanceBlock {


    {
        System.out.println("Instance block");
    }

    public InstanceBlock() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        new InstanceBlock();
        new InstanceBlock();
        new InstanceBlock();

/*
    InstanceBlock obj1 = new InstanceBlock();
    InstanceBlock obj2 = new InstanceBlock();
    System.out.println(obj1.name);
    System.out.println(obj2.name);
     */

    }
}







