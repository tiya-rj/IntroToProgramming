package day25_constructors;
import java.time.LocalDate;
public class EmployeeConstructorTesting {

    public static void main(String[] args) {

        EmployeeUsingConstructorMethod e1 = new EmployeeUsingConstructorMethod("ying",32,'F',"SDET",100000,LocalDate.of(2023,12,20));

        System.out.println(e1);
    }


}
