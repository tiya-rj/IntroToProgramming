package day31_inheritanceContinue.MethodOverriding.Animal;

import day31_inheritanceContinue.MethodOverriding.Animal.Animal;

public class Lion extends Animal {

    private boolean isAfricanLion; //extra method

    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfricanLion) {
        super(name, breed, gender, age, size, color);
        setAfricanLion(isAfricanLion); //Also have to put it in constructor
    }

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }

    @Override
    public void eat() {
        System.out.println("Lion "+getName()+" is eating deer");
    }

    public void roar(){
        System.out.println("Lion "+getName()+" is roaring");
    }


    @Override
    public String toString() { // the way to call toString from parent class
        return  super.toString().replace("}", "") +// hot to get rid of extra "}"
                ", African lion='" + isAfricanLion + '\'' +
                '}';
    }



}
