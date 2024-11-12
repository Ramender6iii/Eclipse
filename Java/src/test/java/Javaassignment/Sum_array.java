package Javaassignment;

import java.util.Arrays;

public class Sum_array {

	public static void main(String[] args) {
		//
		// Initialize an array arr and a variable sum
		//
		//Set the value of sum=0.
 		//Start a for loop from index 0 to the length of the array – 1.
		//In every iteration, perform sum = sum + arr[i].
		//After the termination of the loop, print the value of the sum.
		

		
		// Java Program to find sum of elements in a given array
		 
		// Initialize an array
		 int arr[] = {12, 3, 4, 15};
		 
	      // Print the sum of the array
	        System.out.println("Sum of given array is " + sum(arr));
	    }
			
		    // method for sum of elements in an array
			static int sum(int[] arr) {
				int sum = 0; // initialize sum
			    	
				/*sample 1
		        // Iterate through all elements and add them to sum
		        for (int i = 0; i < arr.length; i++)
		            sum += arr[i];

		        return sum;
				*/
				
				//Sample 2
				for (int i:arr) {
					sum += i;								
				}
				return sum;
			}	
			//
			
		/*
			//One Line Solution 
			
			//One Line solution using Java inbuilt method 
			//import java.util.Arrays is an important statement
			//Syntax
			//Arrays.stream(arrayName).sum();
			
			
		        int [] nums = {1,2,3,4,5};
		          int sum2 = Arrays.stream(nums).sum();
		          System.out.println(sum2);
		    }
		*/
	
		/*
		//Using Recursion:
		//sum of array elements using Recursion

        int[] arr2 = {1, 2, 3, 4, 9};
        int n = arr2.length;
        int sum3 = sumArray(arr2, n-1);
        System.out.println("Sum of the elements in the array: " + sum3);
	}
	
    public static int sumArray(int[] arr2, int n) {
        if (n == 0) {
            return arr2[n];
        }
        return arr2[n] + sumArray(arr2, n-1);
        */
    }
 




