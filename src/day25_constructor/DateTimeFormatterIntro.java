package day25_constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeFormatterIntro {

    public static void main(String[] args) {

        System.out.println("-------format date----------");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("y/MMM/dd E");

        LocalDate today = LocalDate.now();
        System.out.println(today.format(df));

        System.out.println("--------format Time----------");
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm a");
        LocalTime time1 = LocalTime.of(7,5);
        System.out.println(tf.format(time1)); //07:05

        System.out.println("-----format dateTime---------");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE, dd/MM/y HH:mm a");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(dtf));
    }
}
