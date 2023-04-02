package day05_operators;

public class Class01_SalaryCalculator {
    public static void main(String[] args){

        // 1.1

        double hourlyRate = 50, // this is implicit casting since it's technically int casting to double
                weeklyHours = 45,
                stateTaxRate = 6, // 6%
                federalTaxRate = 26; // 26%

        // 1.2

        double salaryBeforeTax = hourlyRate * weeklyHours * 52,
                stateTax = salaryBeforeTax * stateTaxRate / 100,
                federalTax = salaryBeforeTax * federalTaxRate / 100,
                totalTax = stateTax + federalTax,
                salaryAfterTax = salaryBeforeTax - totalTax;

        // 1.3
        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("Federal tax is: $" + federalTax);
        System.out.println("State tax is: $" + stateTax);
        System.out.println("Total tax is: $" + totalTax);
        System.out.println("Net income is: " + salaryAfterTax);

        System.out.println();

        // one print statement
        System.out.println("Gross pay is: $" + salaryBeforeTax +
                "\nFederal tax is: $" + federalTax +
                "\nState tax is: $" + stateTax +
                "\nTotal tax is: $" + totalTax +
                "\nNet income is: " + salaryAfterTax
        );

    }//main close
}//class close
/*
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
 */
