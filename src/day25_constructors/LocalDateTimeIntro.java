package day25_constructors;

import java.time.LocalDateTime;
public class LocalDateTimeIntro {

    public static void main(String[] args) {

        System.out.println("--------.now method-------------");
        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts);

        System.out.println("-------------.of method-------------");
        LocalDateTime ends = LocalDateTime.of(2023,5,18,11,0);
        System.out.println(ends);

        System.out.println("---------test-----------------");

        System.out.println(starts.getDayOfWeek());
        System.out.println(starts.getHour());

    }
}
