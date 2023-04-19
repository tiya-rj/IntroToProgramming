package day27_accessModifiers;

public class InstanceInitializationBlock {
//the only time that you're gonna use instance block is when you want to set the default value

    public String name;

    public int age;

    /*
    {
        name = "James"; //giving default value for everytime you use, so using constructor for instance is better
        age = 20;
    }
*/


    public InstanceInitializationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {


        InstanceInitializationBlock obj1 = new InstanceInitializationBlock("James", 25);
        InstanceInitializationBlock obj2 = new InstanceInitializationBlock("Aaron", 28);


        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }


}


