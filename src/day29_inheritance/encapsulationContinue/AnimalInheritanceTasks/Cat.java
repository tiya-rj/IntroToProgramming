package day29_inheritance.encapsulationContinue.AnimalInheritanceTasks;

public class Cat extends Animal{
    public void meow (){
        System.out.println(name + " is meowing");
    }

    public void scratch(){
        System.out.println(name + " is scratching");
    }
}