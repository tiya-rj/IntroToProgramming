package Utilities;

import day27_accessModifiers.AccessModifiers;
import day27_accessModifiers.Data;
public class DataClassTesting {

    public static void main(String[] args) {

        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

        Data.method3();
        Data.method4();

        Data obj = new Data();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();

        System.out.println("----------access modifierss testing---------");
        System.out.println(AccessModifiers.publicData); // public always access outside its class
        //System.out.println(AccessModifiers.protectedData); // protected is NOT always accessible in different packages unless there is a subclass
        //System.out.println(AccessModifiers.defaultData); // default is NOT accessible in the different packages
        //System.out.println(AccessModifiers.privateData); // private is NOT accessible anywhere else except its class.


        new AccessModifiers();// this access constructor modifiers is public unless you change it.

        AccessModifiers.publicMethod();
        //AccessModifiers.protectedMethod();
        //AccessModifiers.defaultMethod();
        // AccessModifiers.privateMethod();

    }


}
