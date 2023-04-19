package day27_accessModifiers;

public class StaticInitializationBlockTesting {

    public static void main(String[] args) {

        //new StaticInitializationBlock();

        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);


        System.out.println("---------------test access modifiers------------------------------");


        System.out.println(AccessModifiers.publicData); // public is always accessible in the different packages.

        System.out.println(AccessModifiers.protectedData); // protected is NOT always accessible in different packages unless there is a subclass

        System.out.println(AccessModifiers.defaultData); // default is NOT accessible in the different packages

        //  System.out.println(AccessModifiers.privateData); // private is NOT accessible within same package

        new AccessModifiers();// this access constructor modifiers is public unless you change it.

        AccessModifiers.publicMethod();
        AccessModifiers.protectedMethod();
        AccessModifiers.defaultMethod();
        // AccessModifiers.privateMethod();



    }
}
