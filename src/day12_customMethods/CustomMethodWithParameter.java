package day12_customMethods;

public class CustomMethodWithParameter {

    public static void main(String[] args) {

        oddOrEven(5); // change this number as you need

        System.out.println("------------------------------");

        oddOrEven(1000);

        initial("tiya Jannell");

    }
    // the method take an argument number, then verify if it is ODD or EVEN number

    public static void oddOrEven(int num) { // number must be provided when you call it

        if (num % 2 == 0) {
            System.out.println(num + " is even number");
        } else {
            System.out.println(num + " is odd number");
        }
        System.out.println("--------------------------------------------");


    }
    // create a method that can display the initials of a person
     public static void initial(String ini ){

        //String firstname = "Tiya";
        //String lastname = "Jannell";

         //System.out.println( firstname.substring(0,1)+"."+ lastname.substring(0,1));
         System.out.println(ini.substring(0,1).toUpperCase()+"."+ ini.substring(ini.indexOf(" ")+1,ini.indexOf(" ")+2).toUpperCase()+ ".");


     }



}

