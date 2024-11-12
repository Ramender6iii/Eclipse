package Javalesson;

public class Java_operator {

	public static void main(String[] args) {
		
		/* 
		Java divides the operators into the following groups:
			1)Arithmetic operators + - * / %    --- row 17
			2)Relational/comparison operators > >= < <= != ==   --- row 32
			3)Logical operators && || !   --- row 53
			4)Increment & Decrement operators ++ --   --- row 80
			5)Assignment operators = += -= *= /= %=   --- row 104
			6)Conditional/ternary operators ?:   --- row 129
		*/
		
		//1) Arithmetic Operators + - * / %
		System.out.println("-----Arithmetic Operators-----");
		
		int a=20, b=10;
				
		System.out.println("Sum of a and b is:"+(a+b));
		System.out.println("Diff of a and b is:"+(a-b));
		System.out.println("Multiplication of a and b is:"+(a*b));
		System.out.println("Division of a and b is:"+(a/b));
		System.out.println("Remainder of Division a and b is:"+(a%b));
		
		int result=a+b;
		System.out.println("Sum of a and b is:"+result);
		
		
		//2) Relational/comparison operators > >= < <= != ==
		// returns boolean value - true/false
		
		System.out.println("-----Relational/comparison operators-----");
		
		System.out.println(a>b); //true
		System.out.println(a<b); //false
		System.out.println(a>=b); //true
		System.out.println(a<=b); //false
		
		b=20; //change value of b
		System.out.println(a<=b); //true
		System.out.println(a>=b); //true
		
		System.out.println(a!=b); //false
		System.out.println(a==b); //true
		
		boolean res=a>b;
		System.out.println(res);
		
		
		//3) Logical operators && || !
		// returns boolean value - true/false
		// work between 2 boolean values
		//"&& = and", "|| = or", "! = not equal to"
		
		System.out.println("-----Logical operators-----");
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x && y); //false 
		System.out.println(x || y); //true  
		System.out.println(!x); //false
		System.out.println(!y); //true
		
		boolean b1=10>20;
		System.out.println(b1); //false

		boolean b2=20>10;
		System.out.println(b2); //true
		
		System.out.println(b1 && b2); //false
		System.out.println(b1 || b2); //true
		
		System.out.println((10<20) && (20>10)); //true

		
		//4) Increment & Decrement operators ++ --
		
		System.out.println("-----Increment & Decrement operators-----");
		
		//example 1
		int c=10;
		System.out.println(c); //10
		
		c++;   //c=c+1;
		System.out.println(c); //11
		
		//example 2 - post increment operator
		int d=10;
		int resu=d++;  //assignment and then increment
		System.out.println(resu); //10
		System.out.println(d); //11

		//example 3 - pre increment operator
		int e=10;
		int resul=++e; //increment and then assignment
		System.out.println(resul); //11
		System.out.println(e); //11

		
		//5) Assignment operators = += -= *= /= %=
		
		System.out.println("-----Assignment operators-----");
		
		int f=10;
		f+=5; //f=f+5
		System.out.println(f); //15
		
		f=10;
		f-=5; //f=f-5
		System.out.println(f); //5
		
		f=10;
		f*=2; //f=f*2
		System.out.println(f); //20
		
		f=10;
		f/=5; //f=f/5
		System.out.println(f); //2
		
		f=10;
		f%=5; //f=f%5
		System.out.println(f); //0
		
		
		//6) Conditional/ternary operators ?:
		//var=expression ? result1 (true) :result2 (false) 
		System.out.println("-----Conditional/ternary operators-----");
		
		//Example 1
		int g=200, h=100;
		int i=(g<h) ? g:h;
		System.out.println(i);
		
		//Example 2
		int person_age=30;
		String res1=(person_age>=18) ? "Eligible":"Not eligible";
		System.out.println(res1);
	}
}