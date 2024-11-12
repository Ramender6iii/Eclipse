package Day21;


public class JavaScript {

	public static void main(String[] args) {
		
		
		for (int a=1; a<=50; a++) {
			if (a%3==0 && a%5==0) {
			System.out.println("Both 3&5: " +a);
			}else if (a%3==0){
				System.out.println("only 3: "+a);
			}else if (a%5==0) {
				System.out.println("only 5: "+a);
			}else {
				System.out.println("-- :"+a);
				
				}
		}
		
		
		/*
		int a,b,c;
		a=100;
		b=500;
		c=100;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a+" "+b+" "+c);
		
		b=150;
		System.out.println(b);
		*/
		
		/* 
		 <else if> 
		int a,b,c;
		a=100;
		b=500;
		c=100;
		
		if (a > b) {
			System.out.println("the value:" + (a/b*c));
		} else if (c < b) {
			System.out.println("the value:" + (a*b/c));			
		}else {
			System.out.println("the value:" + (a+b*c));	
	    	}
	    */
		
		/* 
		<variable = (condition) ? expressionTrue :  expressionFalse>
		int a;
		a=200;
		String result;
		result=(a < 199) ? "(a*a)" : "(a+a)";
		System.out.println("the value:" + (result));
		 */
		
		/*
		boolean
		int a=5;
		int b=21;
		if (a>b) {
			System.out.println("the age limit exceed by " + (a-b) + " years");
		}else {
			System.out.println("inadequate age limit by " + (b-a) + " years");
		}
		
		*/
		
		/*
		switch statement
		int day =6;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}
		*/
		
		
		/*
		//switch statement 2
		int day =1;
		switch (day) {
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday"); break;
		case 7: System.out.println("Sunday"); break;
		default: System.out.println("Invalid value");
		}
		*/
		
		
		//switch statement 3
		String day = "Monday";
		switch (day) {
		case "Monday": System.out.println(1); break;
		case "Tuesday": System.out.println(2); break;
		case "Wednesday": System.out.println(3); break;
		case "Thursday": System.out.println(4); break;
		case "Friday": System.out.println(5); break;
		case "Saturday": System.out.println(6); break;
		case "Sunday": System.out.println(7); break;
		default: System.out.println("Invalid day");
		}
		
		/* while loop
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}
		*/
		
		/*
		//Loop
	    for (int i = 0; i <= 5; i++) {
	        System.out.println(i);
	      }
	      */  
	    /*
	    //Loop2
	    for (int j = 0; j <= 10; j = j + 2) {
	        System.out.println(j);
	      }  
	    
	    //Loop3 Nested Loop
	    //Outer Loop
	    for (int k = 1; k <= 2; k++) {
	        System.out.println("Title: " + k);
	        
	     //Inner Loop
		for (int l = 1; l <= 3; l++) {
		        System.out.println("Subtitle: " + l);
	      }  
	    }   
	    
	    //Each Loop 
	    // for (type variableName : arrayName)
	    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	    for (String m : cars) {
	        System.out.println(m);
	    }
	    */
	    
		
		//break and continue
		
		/*
		//break
		for (int n = 0; n < 10; n++) {
		      if (n == 4) {
		        break;
		      }
		      System.out.println(n);
		}
				
		//continue
		for (int o = 0; o < 10; o++) {
		      if (o == 4) {
		        continue;
		      }
		      System.out.println(o);
		    }  
	     */
	
		/*
		//break and continue in while loop
		int p = 0;
	    while (p < 10) {
	      if (p == 5) {
	        p++;
	        continue;
	      }
	      System.out.println(p);
	      p++;
	    }  
	    */
		
		/*
		//Array
	    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	    System.out.println(cars[1]);
	    
	    //Loop through Array
	    String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
	    for (int q = 0; q < cars2.length; q++) {
	      System.out.println(cars2[q]);
	    }
	    
	    //Loop Through an Array with For-Each
	    String[] cars3 = {"Volvo", "BMW", "Ford", "Mazda"};
	    for (String r : cars3) {
	      System.out.println(r);
	    }    
	    */
		
		/*
	    //Multidimensional Arrays
	    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
	    System.out.println(myNumbers[1][0]);  
	    
	    //Loop Through a Multi-Dimensional Array
	     int[][] myNumbers2 = { {1, 2, 3, 4}, {5, 6, 7} };
	     for (int s = 0; s < myNumbers2.length; ++s) {
	        for(int t = 0; t < myNumbers2[s].length; ++t) {
	           System.out.println(myNumbers2[s][t]);
	        }
	     }
	     */
	     
	     /*
	     //Each-Loop Through a Multi-Dimensional Array
	     int[][] myNumbers3 = { {1, 2, 3, 4}, {5, 6, 7} };
	     for (int[] row : myNumbers3) {
	       for (int u : row) {
	         System.out.println(u);
	       }
	     }
	      */
	}
}	