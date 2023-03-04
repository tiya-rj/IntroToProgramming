package day05_operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        int a = 20;
        System.out.println(a);

        a = 40;
        System.out.println(a); // 'a'  gets updated to 40

        System.out.println("-------------------------------------------");

        double balance = 100;
        balance += 1000; // balance = 100+1000
        System.out.println("Balance = " + balance);

        balance -= 200; // 1100-200
        System.out.println("balance = " + balance);

        double salary = 45000;
        salary *= 2; // salary = 45000 * 2
        System.out.println("salary = " + salary);

        System.out.println("-------------------------------------------------");


        double eth = 4;
        eth *= 250;
        System.out.println("eth = " + eth);

        eth /= 2;
        System.out.println("eth = " + eth);

        System.out.println("------------------------------------------------");

        int b = 39;
        b %=7; //b = 39%7
        System.out.println(b);



    }
}
