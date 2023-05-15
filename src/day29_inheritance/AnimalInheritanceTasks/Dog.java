package day29_inheritance.AnimalInheritanceTasks;

public class Dog extends Animal{ //use extends to inheritance from Animal
//import is just borrowing, inheritance is for having

    public void bark(){
        System.out.println(name + " is barking");
    }
}

/*
7 variables ,5 methods
are inheritance from Animal
public void method(){
        System.out.println(name);
        System.out.println(breed);
        System.out.println(gender);
        System.out.println(color);
        System.out.println(age);
        System.out.println(size);
        System.out.println(isAnimal);

        setInfo();
        eat();
        drink();
        sleep();
        toString()
 */