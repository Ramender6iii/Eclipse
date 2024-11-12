package Javaassignment;

public class ReverseaString {

	public static void main(String[] args) {
		
		//1) Using + (String concatenation) operator
		
		String str="ABCD";
		String rev="";
		
		/*int leng=str.length(); //4
		
		for(int i=leng-1;i>=0;i--) //3 2 1 0
		{
			rev=rev+str.charAt(i); //DCBA
		}
		System.out.println("Reversed Strring is:"+ rev);
		*/
		
		
		//2) Using character array
		
		char a[]=str.toCharArray();
		int leng=a.length; //4
		
		/*for(int i=leng-1;i>=0;i--) //3 2 1 0 -1
		{
			rev=rev+a[i]; //DCBA
		}
		System.out.println("Reversed Strring is:"+ rev);
		*/
		
		
		//3) Using String Buffer class
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}

}
