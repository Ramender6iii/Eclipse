package Javaassignment;

import java.util.Scanner;

public class Reverseanumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		
		int num=sc.nextInt(); //1234
		sc.close(); //close scanner system to prevent resource leak
		
		/* 
		//1.Using algorithm
		
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;  //0*10 + 1234%10 =4
			num=num /10; //1234/10=123 //then 4 omitted, then continue all number omitted 1 by1 until finish
		}
		 System.out.println("Reverse Number is: " + rev);
		*/
		
		//
		//2.Using algorithm 2
		
				int rev=0;
								
				while(num!=0)
				{
					int rem =num%10;
					rev = rev *10 + rem;
					System.out.println("result: "+rev);
					num = num/10;
				}
				//
				//
				
		
		/*
		//3.Using StringBuffer class
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		System.out.println("Reverse Number is: " + rev);
		*/
		
		/*
		//4.Using StringBuilder class
		StringBuilder sbl=new StringBuilder();
		
		sbl.append(num);
		
		StringBuilder rev=sbl.reverse();
		System.out.println("Reverse Number is: " + rev);
		*/
			
		
	}

}
