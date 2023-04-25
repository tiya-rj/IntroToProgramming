package day30_inheritance.PhoneTask.TypeOfInheritance;

import java.time.LocalDate;

public class Teacher extends Employee{ //Multi-level inheritance bc Employee is a child of Person.
    public Teacher(String name, char gender, LocalDate DOB, String employeeId, String jobTitle, double salary) {
        super(name, gender, DOB, employeeId, jobTitle, salary);
    }

    public void teach(){
        System.out.println(getEmployeeId()+" is teaching.");

    }

}
