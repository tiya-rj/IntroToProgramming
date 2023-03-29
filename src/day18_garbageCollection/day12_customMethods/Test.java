package day18_garbageCollection.day12_customMethods;

public class Test {



    public static void main(String[] args) {

        int num = 300;

        CustomMethodWithParameter.oddOrEven(300);

        // if you already create the custom method (utility), you can call it to use in other class

        String ini = "Miya Jannell";
        CustomMethodWithParameter.initial("Miya Jannell");
    }
}
