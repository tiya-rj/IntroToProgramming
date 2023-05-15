package day36_polymorphismCasting;


import day29_inheritance.AnimalInheritanceTasks.Animal;
import day29_inheritance.AnimalInheritanceTasks.Dog;
import day30_inheritance.PhoneTask.Iphone;
import day30_inheritance.PhoneTask.MobilePhones;
import day33_abstraction.abstractionClass.Developer;
import day33_abstraction.abstractionClass.Employee;

public class ReferenceTypeCasting {

    public static void main(String[] args) {

        Dog dog = new Dog();

        // Cat cat = new Dog();

        Animal animal = (Animal) new Dog(); // implicit casting

        System.out.println("-----------------------------------------------------");

        Animal animal1 = new Dog(); //upcasting ==> Polymorphism
        animal1.setInfo("Max", "Husky", 'M', "large", 4, "White");

        animal1.eat();
        animal1.drink();
        animal1.sleep();

        ((Dog) animal1).bark();  // down casting  1 time using form

        //  Dog dog1 = (Dog)animal1; // down casting multiple using form
        //   dog1.bark();

        //  ( (Cat)animal1).scratch(); // Dog can not be converted to Cat, because there is not "IS A" relationship between dog and cat


        System.out.println("-------------------------------------------------------------");

        MobilePhones phone = new Iphone("XR20", "Small", 999, "Gray"  );

        phone.call(911);
        phone.text(123456);
        ((Iphone) phone).faceTime(12345);

        //    ( (IPhone)phone ).faceTime(123456); // Nokia can not be converted to Iphone, because there is not "IS A" relationship between Nokia and Iphone



        System.out.println("-------------------------------------------------------------");

        Employee employee = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        employee.work();

        System.out.println(((Developer) employee).getProgrammingLanguage());


        //    Driver driver = (Driver) employee;
    }
}
