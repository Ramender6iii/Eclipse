package Javaassignment;

public class Switchcase {

	public static void main(String[] args) {
		
		//selection of week number and display the week day 
		System.out.println("----- selection with week number -----");
		
		int weekno=4;
		
		switch(weekno)
		{
		case 1:	System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday"); break;
		case 7:	System.out.println("Sunday"); break;
		default: System.out.println("invalid week number");
		}
		
		
		//selection of week day and display the week number
		System.out.println("----- selection with week day -----");
		String weekname="Thursday";
		
		switch(weekname)
		{
		case "Monday":	System.out.println(1); break;
		case "Tuesday": System.out.println(2); break;
		case "Wednesday": System.out.println(3); break;
		case "Thursday": System.out.println(4); break;
		case "Friday": System.out.println(5); break;
		case "Saturday": System.out.println(6); break;
		case "Sunday":	System.out.println(7); break;
		default: System.out.println("invalid week day");
		}
		
	}

}
