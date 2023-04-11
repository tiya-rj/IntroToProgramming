package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.util.Arrays;

public class PersonInfoObjectsTesting {

    public static void main(String[] args) {

        PersonInfo[] people = {new PersonInfo(), new PersonInfo(), new PersonInfo()};
        people[0].setInfo("Mia", 'F', LocalDate.of(1992,1,10));
        people[1].setInfo("Isla", 'F', LocalDate.of(1998,3,31));
        people[2].setInfo("Tyler", 'F', LocalDate.of(1989,8,19));

        ArrayList<PersonInfo> lists = new ArrayList<>();
        lists.addAll(Arrays.asList(people));

        //remove all the person object that has the age > 30


    }
}
