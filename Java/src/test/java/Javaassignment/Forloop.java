package Javaassignment;

public class Forloop {

	public static void main(String[] args) {

		// example 1 = with multiple if else condition with operator	
		System.out.println("----- for loop with divison with 3 and 5-----");
		
		int b=30;
		
		for (int a=1; a<=b; a++) {
			//a<=b, the limit can be direct inputed as a<=30;
			// this just to enable input value from other line rather then go to "for" to modify
			if (a%3==0 && a%5==0) { //able to devision with 3 and 5 and remainder is 0
			System.out.println("Both 3&5: " +a);
			}else if (a%3==0){ //devision with 3 only
				System.out.println("only 3: "+a);
			}else if (a%5==0) { //devision with 5 only
				System.out.println("only 5: "+a);
			}else { //not able division with 3 or 5
				System.out.println("-- :"+a);
				
				}
		}
		
				
	}

}
