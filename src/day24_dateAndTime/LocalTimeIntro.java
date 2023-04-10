package day24_dateAndTime;

import java.time.LocalDate;
 import java.time.LocalTime;
public class LocalTimeIntro {

    public static void main(String[] args) {

        System.out.println("-------LocalTime.now() method-------------");

        LocalTime now = LocalTime.now();
        System.out.println(now);

        System.out.println("-------LocalTime.of() method-------------");
        LocalTime time1 = LocalTime.of(10,30,59);
        System.out.println(time1);

        System.out.println("-------.plusHours() method-------------");
        time1 = time1.plusHours(1);
        System.out.println(time1);

        System.out.println("-------.plusMinutes() method-------------");
        System.out.println(now.plusMinutes(30));

    }
}
