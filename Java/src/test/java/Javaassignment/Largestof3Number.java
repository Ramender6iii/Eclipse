package Javaassignment;

import java.util.Scanner;

public class Largestof3Number {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		int a=sc.nextInt();
		
		System.out.println("Enter Second Number:");
		int b=sc.nextInt();
		
		System.out.println("Enter Third Number:");
		int c=sc.nextInt();
		
		sc.close(); //close scanner system to prevent resource leak
					
		//Approach1 - Logic
		/*
		if(a>b && a>c)
		{
			System.out.println(a+ " is Largest Number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+ " is Largest Number");
		}
		else
		{
			System.out.println(c+ " is Largest Number");
		}
		*/
		
		//Ternary Operator
		//int largest1=a>b?a:b; //largest of a & b
		//int largest2=c>largest1?c:largest1; //largest of c & largest 1
		//int largest3=(a>b && a>c)? a: ((b>a && b>c)?b:c);  //largest of a, b & c
		
		int largest=c>(a>b?a:b)?c:(a>b?a:b); //also largest of a, b & c
		
		System.out.println(largest +" is the Largest Number");
		System.out.printf("Largest among [%d, %d, %d] is %d", a,b,c,largest);
		
	}

}
