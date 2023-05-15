package day28_encapsulation.encapsulation;

public class StudentTest {

    public static void main(String[] args) {

        Student student = new Student();

        // student.age = -200;

        //  System.out.println( student.age );

        System.out.println("-----using setter and getter--------");

        student.setAge(25); //how to set the age

        System.out.println( student.getAge());


        // student.name = "Aaron";
          student.setName("Aaron");

        System.out.println(student.getName());





    }

}
