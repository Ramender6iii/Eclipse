package Day21;

//import java.util.Scanner;


public class JavaScriptworkplace {
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		*/
		
		//There are three ways to reverse a number in Java:
        	/*
			Reverse a number using for loop
			Reverse a number using while loop
			Reverse a number using recursion
			*/
		/*
		//Reverse a number using while loop
		int number = 12, reverse = 0;  
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		*/
		
		/*
		//Reverse a number using for loop
		int number = 100, reverse = 0;  
		//we have not mentioned the initialization part of the for loop  
		for( ;number != 0; number=number/10)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		*/
		
	
		/*
		//Reverse a number using recursion
		
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
		
		
		/*
		//reversed a String
		String originalStr="Hello 665788"; {
		String reversedStr="";	
		
		for (int i = 0; i < originalStr.length(); i++) {
			  reversedStr = originalStr.charAt(i) + reversedStr;
			}

			System.out.println("Reversed string: "+ reversedStr);
		}
		*/
		
		
		/*
		for (int a=1; a<=50; a++) {
		if (a%2==0){
			System.out.println(a+" even");
		}else {
			System.out.println(a+" Odd");
			}
		}
		*/
		
		
		 /* sum odd and even number
        int arr[] = {1,2,3,4,5,};
        int even = 0, odd = 0;
 
        // Loop to find even, odd sum
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                even += arr[i];
            else
                odd += arr[i];
        }
 
        System.out.println("Even index positions sum: " + even);
        System.out.println("Odd index positions sum: " + odd);
        */
		
		
    /*
	    // Function to return the reverse of a number 
	    static int reverse(int n) 
	    { 
	        int rev = 0; 
	        while (n != 0) { 
	            rev = (rev * 10) + (n % 10); 
	            n /= 10; 
	        } 
	        return rev; 
	    } 

	 
	    // Function to find the sum of the odd 
	    // and even positioned digits in a number 
	    static void getSum(int n) 
	    { 
	        n = reverse(n); 
	        int sumOdd = 0, sumEven = 0, c = 1; 
	 
	        while (n != 0) { 
	 
	            // If c is even number then it means 
	            // digit extracted is at even place 
	            if (c % 2 == 0) 
	                sumEven += n % 10; 
	            else
	                sumOdd += n % 10; 
	            n /= 10; 
	            c++; 
	        } 
	 
	        System.out.println("Sum odd = " + sumOdd); 
	        System.out.println("Sum even = " + sumEven); 
	    } 
	 */
	    // Driver code 
	    public static void main(String args[]) 
	    { 
	        int n = 457892; 
	        getSum(n); 
		//
		
		/*
	   for (int a=1; a<=50; a++) {
	   
	    if (a%2==0){
			System.out.println(a+ " even");
		}else {
			System.out.println(a+" Odd");
			}
		}
		*/
		/*
		int x=10, y=10; {
			if (x!=y){
			    if(x>y) {
			      System.out.println("x > y :" + (x-y));
			  } else {
			    System.out.println("y > x :" + (y-x));
			  }
			}else {
			System.out.println(x);
			}
		}
		 
		 */
		
		/*
        double bill = 180; // Example bill value

        if (bill < 0) {
            System.out.println("Bill value is negative.");
        } else if (bill > 0) {
            System.out.println("Bill: " + bill);
            
            if (bill > 0 && bill < 100) {
                bill = 40;
            } else if (bill > 100 && bill <= 200) {
            	bill = bill + (bill - 100) * 0.5;
            } else if (bill > 200) {
                bill = bill + 50 + (bill - 200) * 0.1;
            }
        
            if (bill >= 100) {
                bill = bill*0.9; // Discount
            }

            System.out.println("Final Bill: " + bill);
        } else {
            System.out.println("Bill value is zero.");
        }
        */
        
		/*
        double bill = 40; // Example bill value
        int usage = 500;
        
        if (usage <= 0) {
            System.out.println("Bill value is negative.");
        } else if (usage > 0) {
            System.out.println("Usage: " + usage);
            
            if (usage > 100 && usage <= 200) {
            	bill = bill + (usage - 100) * 0.5;
            } else if (usage > 200) {
                bill = bill + 50 + (usage - 200) * 0.1;
            }
        
            if (bill >= 100) {
                bill = bill*0.9; // Discount
            }

            System.out.println("Bill: " + bill);
        } else {
            System.out.println("Bill value is zero.");
        }
        */
    }
}