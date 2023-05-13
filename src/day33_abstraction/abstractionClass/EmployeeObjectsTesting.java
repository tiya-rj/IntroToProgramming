package day33_abstraction.abstractionClass;

public class EmployeeObjectsTesting {

    public static void main(String[] args) {
        //Employee employee = new Employee //cannot create object from abstract class

        Teacher teacher = new Teacher("Nongluck",60,'F',"123","Thai teacher",100500);

        Developer developer = new Developer("Ying",33,'F',"234","SDET",90000,"Java");


        teacher.work();
        developer.work();
        
        System.out.println(teacher);
        System.out.println(developer);


    }
}
