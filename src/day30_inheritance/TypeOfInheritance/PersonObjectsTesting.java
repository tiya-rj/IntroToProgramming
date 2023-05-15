package day30_inheritance.TypeOfInheritance;

import java.time.LocalDate;

public class PersonObjectsTesting {

    public static void main(String[] args) {

        Student student = new Student("Olga", 'F', LocalDate.of(1990,4,12),'A',"53211");

        President president = new President("Tiya",'F',LocalDate.of(1991,8,21),LocalDate.of(2010,3,30));
        Teacher teacher = new Teacher("Juria",'F',LocalDate.of(1970,5,4),"765443","Math", 67900);

        System.out.println(student);
        System.out.println(teacher);
        System.out.println(president);

        student.study();
        teacher.teach();
        president.setRules();

        System.out.println("-------------common methods----------------");

        student.eat("salad");
        teacher.eat("pizza");
        president.drink("water");


    }
}
