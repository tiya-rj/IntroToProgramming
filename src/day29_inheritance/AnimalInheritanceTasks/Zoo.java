package day29_inheritance.AnimalInheritanceTasks;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Miya", "Cockapoo",'F',"Medium",4,"Apricot");

        Cat cat = new Cat();
        cat.setInfo("Lolo","ShotHair",'F',"small",4,"gray");

        Tiger tiger = new Tiger();
        tiger.setInfo("Hunter","Bengal",'M',"large",5,"orange");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("---call the method-----");
        dog.eat();
        dog.sleep();
        dog.bark();


    }
}
