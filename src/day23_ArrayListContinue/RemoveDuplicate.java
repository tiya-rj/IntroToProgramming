package day23_ArrayListContinue;

import java.util.ArrayList;

public class RemoveDuplicate {

    public static void main(String[] args) {

        ArrayList<String> student = new ArrayList<>();
        student.add("Bee");
        student.add("Mika");
        student.add("Leo");
        student.add("Bruno");
        student.add("Mika");

        ArrayList<String > NonDuplicate = new ArrayList<>();

        for (String each : student) {

            if(NonDuplicate.contains(each)){
                continue;
            }
            NonDuplicate.add(each);

        }
        System.out.println(NonDuplicate);


    }
}
