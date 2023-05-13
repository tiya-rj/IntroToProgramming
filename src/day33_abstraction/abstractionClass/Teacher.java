package day33_abstraction.abstractionClass;

public class Teacher extends Employee{
    public Teacher(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {// without overridding this method, it will show an error.

        System.out.println(getName()+ " is teaching.");
    }
}
