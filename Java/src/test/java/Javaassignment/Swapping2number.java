package Javaassignment;

public class Swapping2number {

	public static void main(String[] args) {
		
		int a=10, b=20;
		
		System.out.println("Before swapping values are ... "+a+" "+b);
		
		//Logic1 - Third variable
		/*int t=a;
		a=b;
		b=t;*/
		
		//Logic2 - use + & - without using third variable
		/*a=a+b; //10+20=30
		b=a-b; //30-20=10
		a=a-b; //30-10=20*/
		
		//Logic3 - use * and / without using third variable
		//here a & b values should not be zero
		/*a=a*b; //10*20=200
		b=a/b; //200/20=10
		a=a/b; //200/10=20*/
		
		//Logic4 - bitwise XOR (^) //convert to binary and then dec
		/*a=a^b; //10^20=30
		b=a^b; //30^20=10
		a=b^a; //30^10=20*/
		
		//Logic5 - Single Statement
		b=a+b-(a=b);
		//execution will from right to left
		//(a=b)=10
		//a+b=30
		//30-(10)=20
		System.out.println("After swapping values are ... "+a+" "+b);
		
	}

}
