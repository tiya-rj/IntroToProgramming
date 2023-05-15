package day34_abstractionInterface.animalTask;

public class Eagle extends Animal implements Flyable {

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void eat() {

    }

    @Override
    public void fly() {


    }
}
