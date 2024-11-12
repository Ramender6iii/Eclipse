package Javalesson;

public class Java_variables {

	public static void main(String[] args) {
	
	// variables is for storing type of data and max limit

		// int a; //declaration only
		// a=100; //assignment data for declared interger 

		int a=100; //declaration with data
		System.out.println(a); //100
		
		a=200; //able to change data
		System.out.println(a);
		
		int b,c,d;
		b=300;
		c=400;
		d=500;
		System.out.println(b+c%d);
		
		/*
		 * Data        size     desc
		 * ------------------------------
		 * byte        1byte    -128 to 127
		 * short       2bytes   -32,768 to 32,767
		 * int         4bytes   -2,147,483,648 to 2,147,483,647
		 * long        8bytes   -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		 * float       4bytes   number with decimal xx.1234567
		 * double      8bytes   number with decimal xx.123456789012345
		 * boolean     1bit     return true or false values
		 * char        2bytes   single character example 'A', 'B'
		 * String               "data"
		 */
		
		byte by=107;
		System.out.println(by);
		
		short sh=30111;
		System.out.println(sh);
		
		long l=12345888L;  //literal is needed L/l after data
		System.out.println(l);
		
		float fl=107.58f;
		System.out.println(fl);
		
		double db=26.12345852;
		System.out.println(db);
		
		boolean bl=true;
		System.out.println(bl);
		
		boolean val=db >= fl;
		System.out.println(val);
		
		char grade='A';
		System.out.println(grade);
		
		String name="John";
		System.out.println(name);
		
		
		// example 1
		
	    // Student data
	    String studentName = "John Doe";
	    int studentID = 15;
	    int studentAge = 23;
	    float studentFee = 75.25f; 
	    char studentGrade = 'B';
	    
	    // Print variables
	    System.out.println("Student name: " + studentName);
	    System.out.println("Student id: " + studentID);
	    System.out.println("Student age: " + studentAge);
	    System.out.println("Student fee: " + studentFee);
	    System.out.println("Student grade: " + studentGrade);
		
		
		//Example 2
	   // Create integer variables
	    int length = 4;
	    int width = 6;
	    int area;

	    // Calculate the area of a rectangle
	    area = length * width;

	    // Print variables
	    System.out.println("Length is: " + length);
	    System.out.println("Width is: " + width);
	    System.out.println("Area of the rectangle is: " + area);
		
		
	}

}
