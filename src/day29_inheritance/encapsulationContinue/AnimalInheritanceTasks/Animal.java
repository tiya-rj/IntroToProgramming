package day29_inheritance.encapsulationContinue.AnimalInheritanceTasks;

public class Animal {

    public String name;
    public String breed;
    public char gender;
    public String size;
    public int age;
    public String color;

    public static boolean isAnimal;
    static {
        isAnimal = true; //just to show in case of using static
    }

    public void setInfo(String name, String breed, char gender, String size, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    public void eat(){
        System.out.println( name + " is eating");
    }
    public  void drink(){
        System.out.println(name +" is drinking");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public String toString() {
        return getClass().getSimpleName()+ "{" + //don't forget to change this otherwise it will show Animal when you print in dog/cat/tiger class
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}


/*
0. Animal
			attributes:
					name, breed, gender, size, color, age
			methods:
				setInfo(), eat(), sleep(), drink(), toString()
 */