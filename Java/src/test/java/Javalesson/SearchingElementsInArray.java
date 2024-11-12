package Javalesson;

public class SearchingElementsInArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		int search_element=80;
		
		boolean status=false; //false - not found    true - found
		
		//normal for loop
		for(int i=0;i<=a.length;i++)
		{
			if(a[i]==search_element)
			{
				System.out.println("Element found");
				status=true;
				break;
			}
		}
		
			if(status==false)
			{
				System.out.println("Element not found");
			}
	}

}
