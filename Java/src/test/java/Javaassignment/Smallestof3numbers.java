package Javaassignment;

import java.util.Scanner;

public class Smallestof3numbers {

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
			if(a<b && a<c)
			{
				System.out.println(a+ " is Smallest Number");
			}
			else if(b<a && b<c)
			{
				System.out.println(b+ " is Smallest Number");
			}
			else
			{
				System.out.println(c+ " is Smallest Number");
			}
			*/
			
			//Ternary Operator
			//int smallest1=a<b?a:b; //smallest of a & b
			//int smallest2=c<smallest1?c:smallest1; //smallest of c & smallest 1
			//int smallest3=(a<b && a<c)? a: ((b<a && b<c)?b:c);  //smallest of a, b & c
			
			int smallest=c<(a<b?a:b)?c:(a<b?a:b); //also smallest of a, b & c
			
			System.out.println(smallest +" is the Smallest Number");
			System.out.printf("Smallest among %d %d and %d is %d", a,b,c,smallest);
			
	}

}
