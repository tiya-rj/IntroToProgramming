package day33_abstraction;

import java.time.LocalDate;

public class CydeoDevObjectsTesting {

    public static void main(String[] args) {
        CydeoDevStudent student1 = new CydeoDevStudent("Alia",'F', LocalDate.of(1999,10,19),"101","B29",123);
        System.out.println(student1);
        student1.eat();
        student1.breath();
    }
}
