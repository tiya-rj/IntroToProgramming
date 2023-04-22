package day28_encapsulation.personTask;

public class PersonObjectTesting {

    public static void main(String[] args) {

        Person person1 = new Person("Tiya");

        Person person2 = new Person("Aaron", 'M');

        Person person3 = new Person("Charlie", 30);

        Person person4 = new Person("Daniel", "English");

        Person person5 = new Person("Mia", 25, 'F');

        Person person6 = new Person("Lucy", 31, 'F', "English");

        person4.name = "James";

        // person1.planet = "Mars"; it will change all planet object to Mars
        //  Person.planet = "Mars"; change it when need it to change all of it


        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);


        Person.printPlanetName(); //static can call through the class name

        person1.eat("Chocolate cake");

        person2.drink("Water");

        person5.drink("Tea");

        person6.drink("Coffee");


    }

}
