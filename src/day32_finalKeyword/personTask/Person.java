package day32_finalKeyword.personTask;

import java.time.LocalDate;

    public class Person {

        private String name;//this has no error bc String has default value

        //but these 3 down without the objects in constructor to initialize it will show error
        private final char gender;
        private final int age;
        private final LocalDate dateOfBirth;


        public static final int numberOfHead;

        static{ //use static to initialize static variable (fix error for using final in static)
            numberOfHead = 1;
        }

        public Person(String name, char gender, LocalDate dateOfBirth) {
            setName(name);
            if( !(gender=='M' || gender == 'F')){
                System.err.println("Invalid gender: "+gender);
                System.exit(1);
            }
            this.gender = gender;
            this.dateOfBirth = dateOfBirth;
            this.age = LocalDate.now().getYear() - dateOfBirth.getYear();

        }

        public String getName() {
            return name;
        }

        public char getGender() {
            return gender;
        }

        public int getAge() {
            return age;
        }

        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }

        public void setName(String name) { // can generate only the setter for setter bc the rest is final
            this.name = name;
        }


        public void eat(){
            System.out.println(name+" is eating");
        }

        public void drink(){
            System.out.println(name+" is drinking");
        }

        public void sleep(){
            System.out.println(name+" is sleeping");
        }

        public final void breath(){ // To make sure that this implementation will not change for any subclass
            System.out.println(name +" is breathing");
        }

        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    ", age=" + age +
                    ", dateOfBirth=" + dateOfBirth +
                    '}';
        }


    }

/*
Variables:
    name, gender, age, dateOfBirth
    numberOfHead
Methods:
    eat(), drink(), sleep()
    breath()
 */

