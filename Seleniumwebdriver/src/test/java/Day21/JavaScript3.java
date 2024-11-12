package Day21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaScript3 {

	public static void main(String[] args) {
		
		/*
	    Scanner myObj = new Scanner(System.in);
	    String userName;
	    
	    // Enter username and press Enter
	    System.out.println("Enter username"); 
	    userName = myObj.nextLine();   
	       
	    System.out.println("Username is: " + userName);        
	  */
	
	 //still error not sure how to do it
		
		   int result = sum(10);
		   System.out.println(result);
	}
		   
		  public static int sum(int k) {
		    if (k > 0) {
		      return k + sum(k - 1);
		    } else {
		      return 0;
		    }
		  }

		
		
		/* 
	    // Recursion
		//function call itself
		// 10 + sum(9)
		//  10 + ( 9 + sum(8) )
		//  10 + ( 9 + ( 8 + sum(7) ) )
		//...
		//  10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
	 
	   int result = sum(10);
	   System.out.println(result);
	  }
	  public static int sum(int k) {
	    if (k > 0) {
	      return k + sum(k - 1);
	    } else {
	      return 0;
	    }
	}
	  
	   */
	  
		
		/*
	   // Halting Condition

		    int result = sum(5, 10);
		    System.out.println(result);
		  }
		  public static int sum(int start, int end) {
		    if (end > start) {
		      return end + sum(start, end - 1);
		    } else {
		      return end;
		    }
		  }
	  */
	}
