package Javalesson;

public class Java_conditional_if_else_switch {

	public static void main(String[] args) {
		
		/*Conditional Statement
		1)if   --- row 16
		2)if else   --- row 26
		3)nested if else   --- row 92
		4)switch case   --- row 112 with comparison if else

		*/
		
		//conditional statement 
		// 1) if
		
		System.out.println("-----if-----");
		int person_age=25; //if number lower than limit, data will not print
		
		if (person_age>=18) {  //limit
			System.out.println("eligible for vote");
		}
		

		// 2) if else
		System.out.println("-----if else-----");
		
		int person_age2=16; //if else will execute multiple option
		
		if (person_age2>=18) { //limit option
			System.out.println("eligible for vote");
		}
		else { //otherwise
			System.out.println("Not eligible for vote");
		}
		
		
		// 2) if else - check if number is odd/even
		System.out.println("-----if else 2-----");
		
		int num=13;
		
		if (num%2==0) { //number remainder after division
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		
		// 2) if else - multiple condition
		System.out.println("-----if else if -----");
		
		int num2=0;
		
		if (num2>0) {
			System.out.println("Positive Number");
		}
		else if (num2<0){
			System.out.println("Negative Number");
		}
		else
		{
			System.out.println("Zero");
		}
		
		
		// 2) if else - multiple condition2
		/*
		 * a>b and a>c -- a is largest
		 * b>a and b>c -- b is largest
		 * c>b and c>b -- c is largest
		 */
		System.out.println("-----if else if 2 -----");
		
		int a=10, b=20, c=30;
		
		if(a>b && a>c) //and function
		{
			System.out.println("a is the largest number");
		}
		else if (b>a && b>c)
		{
			System.out.println("b is the largest number");
		}
		else
		{
			System.out.println("c is the largest number");
		}
		
		
		//3) nested if else
		//nested mean can have inner is/else condition

		System.out.println("-----Nested if else -----");
				
		if (true) { //Outer if condition
			if(false) //inner if condition, that mean after if selection break down more if condition
			{
				System.out.println("inner True value");
			}
			else
			{
				System.out.println("inner False value");
			}
		}
		else {
			System.out.println("False Number");
		}
		
		
		//4) if else example to compare switch condition below
		System.out.println("-----if else example-----");
		int weekno=1;
		
		if(weekno==1)
		{
			System.out.println("Sunday");
		}
		else if (weekno==2)
		{
			System.out.println("Monday");
		}
		else if (weekno==3)
		{
			System.out.println("Tuesday");
		}
		else if (weekno==4)
		{
			System.out.println("Wednesday");
		}
		else if (weekno==5)
		{
			System.out.println("Thursday");
		}
		else if (weekno==6)
		{
			System.out.println("Friday");
		}
		else if (weekno==7)
		{
			System.out.println("Saturday");
		}
		else
		{
			System.out.println("invalid week number");
		}
		
		// 4) switch case
		System.out.println("-----Switch case-----");
		
		int weekno2=4;
		
		switch(weekno2)
		{
		case 1:	System.out.println("Sunday"); break;
		case 2:	System.out.println("Monday"); break;
		case 3: System.out.println("Tuesday"); break;
		case 4: System.out.println("Wednesday"); break;
		case 5: System.out.println("Thursday"); break;
		case 6: System.out.println("Friday"); break;
		case 7: System.out.println("Saturday"); break;
		default: System.out.println("invalid week number");
		}
				
	}

}
