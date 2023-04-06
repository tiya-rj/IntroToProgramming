package day23_ArrayListContinue;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<String> student = new ArrayList<>();
        student.add("Bee");
        student.add("Mika");
        student.add("Leo");
        student.add("Bruno");
        student.add("Mika");

        for (String each : student) {
            if(student.indexOf(each) == student.lastIndexOf(each)){
                System.out.println(each);
                break; // if want only one unique element




            }
        }

    }
}
