package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {

        System.out.println("----LocalDate.now() method--------");

        LocalDate today = LocalDate.now();
        System.out.println(today);

        System.out.println("-----LocalDate.of() method------------");
        LocalDate Birthday = LocalDate.of(1991, 8, 21);
        System.out.println(Birthday);

        System.out.println("--------.getYear() method--------------");
        System.out.println(today.getYear());

        System.out.println("--------.getMonth() method--------------");
        System.out.println(today.getMonth());

        System.out.println("--------.getMonthValue() method--------------");
        System.out.println(today.getMonthValue());

        System.out.println("--------.getDayOfWeek() method--------------");
        System.out.println(today.getDayOfWeek());
        System.out.println(Birthday.getDayOfWeek());

        System.out.println("--------.getDayOfMonth() method--------------");
        System.out.println(today.getDayOfMonth());

        System.out.println("--------.getDayOfYear() method--------------");
        System.out.println(today.getDayOfYear());

        System.out.println("--------.plusYears() method--------------");
        System.out.println(today.plusYears(1));

        System.out.println("--------.minusYears() method--------------");
        System.out.println(today.minusYears(1));

        System.out.println("--------.plusMonth() method--------------");
        System.out.println(today.plusMonths(1));

        System.out.println("--------.plusWeeks() method--------------");
        System.out.println(today.plusWeeks(7));

        System.out.println("--------.plusDays() method--------------");
        System.out.println(today.plusDays(100));

        System.out.println("--------.isEquals() method--------------");
        LocalDate b1 = LocalDate.of(1986,1,10);
        LocalDate b2 = LocalDate.of(1991, 8,21);
        boolean result = b1.isEqual(b2);
        System.out.println(result);

        System.out.println("--------.isBefore() .isAfter() method--------------");
        LocalDate grad_date = LocalDate.of(2024,12,12);
        System.out.println(grad_date.isBefore(LocalDate.of(2022,12,31)));
        System.out.println(grad_date.isAfter(LocalDate.of(2022,12,31)));

        System.out.println("--------.isLeapYears() method--------------");
        System.out.println(LocalDate.of(2023,4,7).isLeapYear());// leap year means if Feb has 28 day? (false) 29 (true)

        System.out.println("--------------sample---------------------------");
        LocalDate graduationDate = LocalDate.of(2014,3,14);
        graduationDate = graduationDate.plusYears((1)); // 2015-3-14 if you are not resign it back to variable, it will print the old result bc LocalDate method is immuable
        System.out.println(graduationDate);

        graduationDate=graduationDate.plusMonths(10);
        System.out.println(graduationDate);

        System.out.println("----------------------------");
        Birthday = Birthday.minusYears(7).minusMonths(1);
        System.out.println(Birthday);

    }
}
