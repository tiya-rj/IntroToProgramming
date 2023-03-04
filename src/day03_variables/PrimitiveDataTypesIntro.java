package day03_variables;

public class PrimitiveDataTypesIntro {

    public static void main(String[] args) {

        //DateType variableName = Date; //always follow this syntax

        //byte a = "Java"; // it shows error bc byte ONLY accepts integer values (-128 to 127)
        //byte a = 20.5; // byte CANNOT take decimal numbers
        //byte a = 2000; // OUT OF byte's range
        byte a = 20;

        // price of the car is $17500
        short p = 17500;
        System.out.println(p); //calling variable don't use ""

        //salary is $95000
        int s = 95000; //preferred
        System.out.println(s);

        // int n = 9999999999;
        long n = 9999999999L; //by default it's taking the comfier as int
                              //to force integer to use long command by putting L/l at the end

        //gpa = 3.5
        double gpa1 = 3.5; // preferred
        float gpa2 = 3.5F; //by default it's taking the comfier as the double
                            //to force integer to use float command by putting F/f at the end

/*
Primitives :
 int: for integer numbers
 double: for decimal number
 char: for single character ==> ''
 boolean: for True or False expressions

String: for string of texts ""

Declaring variable:
 Datatype variableName = Data;

Variable naming rules:
 1. Must readable, understandable and meaningful
 2. Must be unique
 3. Can use camel case NOT space
 4. CANNOT have special characters other than _ and $
 5. CANNOT start with the date or digits
 6. CANNOT be Java reserved name
 */






    }
}
