package day24_dateAndTime;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;


public class PersonInfoCustomClass {

    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;


    public void setInfo(String name, char gender, LocalDate dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        //calculate age without user passing the age
        age = LocalDate.now().getYear() - dateOfBirth.getYear();

    }
    public String toString() {
        return "PersonInfoCustomClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
