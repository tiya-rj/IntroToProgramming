package day25_constructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmployeeUsingConstructorMethod {

    public String name; //have to be stance not static bc it has to be unique
    public int age;
    public char gender;
    public String jobTitle;
    public double salary; //bc everyone has different salary
    public LocalDate hiredDate;

    public EmployeeUsingConstructorMethod(String name, int age, char gender, String jobTitle, double salary, LocalDate hiredDate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hiredDate = hiredDate;
    }
    // toString allow us to print in the print statement
    public String toString() {
        return "EmployeeUsingConstructorMethod{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hiredDate=" + hiredDate.format(DateTimeFormatter.ofPattern("dd/MMM/y")) +
                '}';//can provide to date format
    }
}
