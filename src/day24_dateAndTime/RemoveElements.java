package day24_dateAndTime;

import day17_customClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElements {

    public static void main(String[] args) {
        System.out.println("----remove element that less than 4--------");

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < 4) {
                nums.remove(i);

            }


        }
        System.out.println(nums);

        System.out.println("-----------------------------");

        ArrayList<Integer> num = new ArrayList<>();

        num.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));


        num.removeIf(p -> p < 4);

        System.out.println(num);

        System.out.println("------remove names that start with J---------------------");

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Java","Ruby", "Java" ,"Python","C#"));


        names.removeIf(each -> each.startsWith("J"));

        System.out.println(names);

        System.out.println("-----------remove salary that more than 10000-------");

        ArrayList<Employee> employees = new ArrayList<>();

        employees.addAll(Arrays.asList(new Employee(), new Employee(), new Employee(), new Employee(), new Employee()));

        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

        employees.removeIf(e -> e.salary >100000);
        for (Employee each : employees) {
            System.out.println(each.name);
        }

    }

}


