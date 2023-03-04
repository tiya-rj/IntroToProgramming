package day05_operators;

public class SalaryCalculator {

    public static void main(String[] args) {

        double hourlyRate =  55, // but value is int by default bc it's integer number
                weeklyHour = 45,
                stateTaxRate = 7,
                federalTaxRate = 24.5;

        //----------------------------------------------------------------

        double salaryBeforeTax = hourlyRate * weeklyHour * 52;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double stateTax = salaryBeforeTax * stateTaxRate / 100; // to converse it to decimal
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is:  $" + salaryBeforeTax);
        System.out.println("Federal Tax is: $" + federalTax);
        System.out.println("State Tax is: $" + stateTax);
        System.out.println("Total Tax is: $" + totalTax);
        System.out.println("Net income is: $" + salaryAfterTax );

    }
}
/*

Java Programming Day05
Topics: Operators
			- Unary:  -, +, --, ++ (post/pre)
			- Shorthand: =, +=, -=, *=, /=, %=
			- Relational: >, < , <=, >=, ==, !=
			- Logical: &&, ||, !

package name: day05_operators

Warmup tasks:
	1. Create a class called SalaryCalculator.java
			1.1declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

			1.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax
				Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			1.3 use print statement to print each of the above
					Ex:	   hourlyRate = $50
						   weeklyHours = 45
						   stateTaxRate = 6 (given as percentage, you need to convert to decimal)
						   federalTaxRate = 26 (given as percentage, you need to convert to decimal)

					    output:
					    	Gross pay is: $117000
					    	Federal tax is: $30420
				    		State tax is: $7020
				    		Total tax is: $37440
				    		Net income is: 79560

arithmetic operators: +, -, *, /, %



Positive Numbers:

		+10 , +20
		10, 20

		++ will increase the number by 1
		-- will decrease the number by 1

		int a = 25;
		system.out.println(++a); ==> 26

Negative Numbers:
		-30, -20



&&: both
||: either

 */