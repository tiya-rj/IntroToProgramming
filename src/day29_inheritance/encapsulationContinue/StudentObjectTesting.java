package day29_inheritance.encapsulationContinue;

public class StudentObjectTesting {

    public static void main(String[] args) {

        Student s1 = new Student("Tiya", 15, 'F','B',"Dara Academy")
;
        System.out.println(s1);

        s1.setSchoolName("Chiang Mai University");
        s1.setAge(23);

        System.out.println(s1);
    }
}
