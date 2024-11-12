package Javalesson;

public class Java_loop_iterative_jump {

	public static void main(String[] args) {
				
		/* 1)Looping/iterative statement
		1)while loop  --- row 20
		2)do while loop  --- row 78
		3)for loop  --- row 90
		4)enhanced for loop / for each loop		
		 
		
		2)Jumping Statement
		5)break   --- row 165
		6)continue   --- row 179
		*/

		
		//1) while loop - example 1
		System.out.println("----- while loop -----");
		
		int a =1;  //initialization
		
		while(a<=10) //condition
		{
			System.out.println(a);
			a++;  //increment			
		}
		//Different with do while loop it will print first then check condition
		//For while loop, if int is above condition no printing	will be done
		
		
		//1) while loop - example 2 print even number
		System.out.println("----- while loop2 (print even number) -----");
		
		int b =2;  //initialization
		
		while(b<=10) //condition
		{
			System.out.println(b);
			b+=2;  //increment+2 b=b+2
		}
				
		//1) while loop - example 3 print even number and check even number
		System.out.println("----- while loop3 (check and print even number) -----");
		int c =1;  
		
		while(c<=10) 
		{
			if(c%2==0)
			{
				System.out.println(c);
			}
			c++;  
		}
		
		
		//1) while loop - example 4 print number and indicate even/odd number
		System.out.println("----- while loop4 (print and indicate even/odd number) -----");
		int d =1;  //initialization
		
		while(d<=10) //condition
		{
			if(d%2==0)
			{
				System.out.println(d + " Even");
			}
			else 
			{
				System.out.println(d + " Odd");
			}
			d++;
		}
		
		
		
		// 2) do while loop
		System.out.println("----- do while loop -----");
		int e=1;
		do
		{
			System.out.println(e); //do print first before execute condition
			e++;
		}while(e<=10); //condition
		//Different with while loop, if int is above condition no printing
		// For do while loop it will print first then check condition
		
	
		// 3) for loop - example 1
		System.out.println("----- for loop -----");
		
		for(int f=1;f<=10;f++)
		{
			System.out.println(f);
		}
	
		
		
		// 3) for loop - example 2 with odd/even number
		System.out.println("----- for loop2 (print with odd/even number) -----");
		
		for(int g=1;g<=10;g++)
		{
			if(g%2==0)
			{
				System.out.println(g + " Even");
			}
			else
			{
				System.out.println(g + " Odd");
			}
		}
		
		
		
		// 3) for loop - Sum odd and even value ex: 2+4+6=12 even
		System.out.println("----- for loop3 -----");
		
			int h = 10;
			int evenSum = 0;
			int oddSum = 0;
			
		    for (int i=1; i<=h; i++) {
			   
			    if (i%2==0){
					evenSum += i;
				}else {
					oddSum += i;
					}
				}
		    
			System.out.println(evenSum+ " Even");
			System.out.println(oddSum+" Odd");
		
			
			
		// 3) for loop - count odd/even number in given interger
		System.out.println("----- for loop4 (count odd/even number in given interger) -----");
		
			int j = 1234;
			int even_count = 0;
			int odd_count = 0;
			
		    while (j>0) //1234 123 12 1
		    {
			   
			    int rem=j%10; //4 3 2 1
			
			    if(rem%2==0)
			    {
			    	even_count++; //1 2
			    }else{
			    	odd_count++; //1 2
			    }
			    
			    j=j/10; //123 12 1 0
		    		    
			System.out.println("Number of Even Numbers: "+even_count);
			System.out.println("Number of Odd Numbers: "+odd_count);
		    }
			
		
			
		// 4)break
		// once it reach break, it will stop the operation
		System.out.println("----- break -----");
		
			for (int k=1; k<=10; k++)
			{
				if(k==5) 
				{
					break;
				}
				System.out.println(k);
			}
			
			
		// 5)continue
		// skip the number before continue / jump the stated value
		System.out.println("----- continue -----");
			for (int l=1; l<=10; l++)
			{
				if(l==5 || l==8) 
				{
					continue;
				}
				System.out.println(l);
			}
				
	}

}
