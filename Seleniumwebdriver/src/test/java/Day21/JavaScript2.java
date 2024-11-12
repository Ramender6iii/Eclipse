package Day21;

public class JavaScript2 {
	/*
	//Methods
	 static void myMethod() {
	    System.out.println("I just got executed!");
		  }

	  public static void main(String[] args) {
	    myMethod();
		myMethod();
		myMethod();
	}
	*/
	
	/*
		 //Parameters and Arguments
		 //Multiple parameter
		 //String called fname is a parameter, while Liam, Jenny and Anja are arguments

	   static void myMethod(String fname, int age) {
		    System.out.println(fname + " is " + age);
			  }

	  public static void main(String[] args) {
		myMethod("Liam", 5);
		myMethod("Jenny", 8);
		myMethod("Anja", 31);	
	  }
	  */
	
	
	//Method Parameters
	//Parameters and Arguments
	
		/* sample 1
		 
	 	  static int myMethod(int x) {
		    return 5 * x;
		  }

		  public static void main(String[] args) {
		    System.out.println(myMethod(3));
		  }
		  */
	
		  /* sample 2
		  static int myMethod(int x, int y) {
			    return x * y;
			  }

		  public static void main(String[] args) {
			  int z = myMethod(5, 3);
			  System.out.println(z);
			  }
		  */
		  
	   /*
	  //Method with If...Else
	   static void checkAge(int age) {

	    if (age < 18) {
	      System.out.println("Access denied - You are not old enough!");

	    } else {
	      System.out.println("Access granted - You are old enough!");
	    }

	  }

	  public static void main(String[] args) {
	    checkAge(20); // Call the checkAge method and pass along an age of 20
	  }
	*/
	
	/*
	//Method Overloading
	//same name with different parameters
	static int plusMethodInt(int x, int y) {
		  return x / y;
		}

	static float plusMethodFloat(float x, float y) {
		  return x % y;
		}
	
		static double plusMethodDouble(double x, double y) {
		  return x / y;
		}

		public static void main(String[] args) {
		  int myNum1 = plusMethodInt(8, 5);
		  float myNum2 = plusMethodFloat(4.3F, 6.26F);
		  double myNum3 = plusMethodDouble(4.3, 6.26);
		  System.out.println("int: " + myNum1);
		  System.out.println("float: " + myNum2);
		  System.out.println("double: " + myNum3);
		}
		*/
	
	/*
	  //Method Scope
	  //Variables declared directly inside a method
	  public static void main(String[] args) {

		    // Code here CANNOT use x

		    int x = 100;

		    // Code here can use x
		    System.out.println(x);
		  }
	  */
	  
	/*
	  //Method Scope
	  //Block Scope
	  //code between curly braces {}
	  public static void main(String[] args) {

		    // Code here CANNOT use x

		    { // This is a block

		      // Code here CANNOT use x

		      int x = 100;

		      // Code here CAN use x
		      System.out.println(x);

		    } // The block ends here

		  // Code here CANNOT use x

		  }
		  */
	
 }
