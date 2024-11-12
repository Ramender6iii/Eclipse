package Day21;

import java.util.Scanner; 

public class Java_reverse {

	public static void main(String[] args) {
		
		//There are four ways to reverse a value in Java:
    	/*
    	Reverse s String using for loop
		Reverse a number using while loop
		Reverse a number using for loop
		Reverse a number using recursion
		*/

		
		//reversed a String
		String originalStr="Hello 665788"; {
		String reversedStr="";	
		
		for (int i = 0; i < originalStr.length(); i++) {
			  reversedStr = originalStr.charAt(i) + reversedStr;
			}

			System.out.println("Reversed string: "+ reversedStr);
		}
		
		
		/*
		//Reverse a number using for loop (*end zero number not able to print)
		int number = 164500, reverse = 0;  
		//we have not mentioned the initialization part of the for loop  
		for( ;number != 0; number=number/10)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		*/
		
		
		/*
		//Reverse a number using while loop  (*end zero number not able to print)
		int number = -100, reverse = 0;  
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		*/
		
		
		/*
		//Reverse a number using recursion (*able to print end zero number, but no -ve value)
		
		//method for reverse a number  
		public static void reverseNumber(int number)   
		{  
		if (number < 10)   
		{  
		//prints the same number if the number is less than 10  
		System.out.println(number);  
		return;  
		}  
		else   
		{  
		System.out.print(number % 10);  
		reverseNumber(number/10);  
		}  
		}  
		public static void main(String args[])  
		{  
		System.out.print("Enter the number that you want to reverse: ");  
		Scanner sc = new Scanner(System.in);  
		int num = sc.nextInt();  
		System.out.print("The reverse of the given number is: ");  
		//method calling  
		reverseNumber(num);  
		*/
		
		//
		//Reverse a number using recursion (*able to print end zero number and -ve value)
		System.out.print("Enter the number that you want to reverse: ");  
		Scanner sc = new Scanner(System.in);  
		int n = sc.nextInt();  
		sc.close();
		
		int reverse_number = reverseNumber(n);   
		
		System.out.println("The reverse of the given number is: "+reverse_number);   
		}  
		//method to reverse a number  
		public static int reverseNumber(int number)   
		{  
		boolean isNoNegative = number < 0 ? true : false;   
		if(isNoNegative)  
		{  
		number = number * -1; //makes the number positive if the given number is negative  
		}   
		int reverse = 0;   
		int lastDigit = 0;   
		while (number >= 1)   
		{  
		lastDigit = number % 10; // gives the last digit of the number  
		reverse = reverse * 10 + lastDigit;   
		number = number / 10; // removes the last digit of the number  
		}   
		//makes the number negative   
		return isNoNegative == true? reverse*-1 : reverse;   
		//
	}
}