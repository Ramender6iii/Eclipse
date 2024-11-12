package Javalesson;

public class Java_arrays {

	public static void main(String[] args) {
		
		/*type of arrays
		1) single dimensional
		2) two dimensional/multiple dimensional
		3) Object Array
		*/
		
		/*1)declare an array   --- rows 30
		  2)add values into array   ---rows 32
		  3)find size/length of an array
		  4)read single value from an array
		  5)read multiple values from an array
		 */
		
		
		//1) single dimensional array
		System.out.println("----- single dimensional array -----"); 
		
		//declaring array and add values into array
		
		//example 1, fixed number of rows

		//[5] indicate 5 rows but the number start from 0 so 0~4 = 5 rows
		//a[] or []a, still correct
		//if value not inserted for any rows space still being used
		
		int a[]=new int[5]; //indicate fixed number of row		
		
		a[0]=100;  //index 0 ... row 1 
		a[1]=200;  //index 1 ... row 2
		a[2]=300;  //index 2 ... row 3 
		a[3]=400;  //index 3 ... row 4
		a[4]=500;  //index 4 ... row 5
		
		//example 2, number of rows depend on data entered
		int b[]= {100,200,300,400,500,600}; //dynamic array, can add or delete value/row, no wasted space

		
		//find size/length of an array
		System.out.println("Length of array row: "+a.length);	//a.length find number of rows
		System.out.println("Length of array row: "+b.length);	//b.length find number of rows
		
		
		//read single value from an array
		System.out.println("read single value: "+a[4]);  /// return 500
		
		
		//read multiple values from an array
				
		//using normal loop
		System.out.println("-read multiple values from an array-"); 
		for(int i=0;i<a.length;i++) //for i<a.length, if add as <=, need to add -1 (i<=a.length-1)
		{
			System.out.println(a[i]);
		}
				
		//using enhanced for loop / for each loop
		System.out.println("-using enhanced for loop-"); 
		for(int x:b) //using : for direct array, mostly common used
		{
			System.out.println(x);
		}
		
		
		
		//2) two dimensional/multiple dimensional
		System.out.println("----- two dimensional/multiple dimensional array -----"); 	
		//example 1, fixed number of rows & column 
		int c[][]=new int[3][2]; //indicate fixed number of row and column
		c[0][0]=100;
		c[0][1]=200;
		
		c[1][0]=300;
		c[1][1]=400;
		
		c[2][0]=500;
		c[2][1]=600;
		
		//example 2, number of rows & column depend on data entered
		int d[][]= { 	{100,200},
						{300,400},
						{500,600}
					}; 
		

		//find size/length of an array
		System.out.println("Length of array row: "+c.length);	//c.length find number of rows
		System.out.println("Length of array row: "+d.length);	//d.length find number of rows
		System.out.println("Length of array column: "+d[0].length);	//d.length find number of column
		
		
		//read single value from an array
		System.out.println("read single value: "+a[4]);  /// return 500
		System.out.println("read single value: "+c[2][1]);  /// return 600
		
		
		//read multiple values from an array
				
		//for two/multiple dimension array 
		
		//using normal loop (Nested loop)
		System.out.println("-read multiple values from an array-"); 
		for(int r=0;r<=c.length-1;r++)
		{
			for(int col=0;col<=c[r].length-1;col++)
			{
				System.out.print(c[r][col]+"   ");
			}
			System.out.println();		
		}
		
		
		//using enhanced for loop / for each loop
		System.out.println("-using enhanced for loop-"); 
		for(int arr[]:d) //using : for direct array, mostly common used
		{
			for(int y:arr)
			{
				System.out.print(y+"   ");
			}
			System.out.println();
		}
		
		
		//3) Object Array
		//using object function so the array value can be anything
		System.out.println("----- Object Array -----"); 
		Object e[]= {100,10.5,'B',"Hello",true};
		
		//read single value from an array
		System.out.println("read single value: "+e[2]);  /// return 'B'
				
		
		//read multiple values from an array
		
		//using normal loop 
		System.out.println("-read multiple values from an array-"); 
		for(int j=0;j<e.length;j++)
		{
			System.out.println(e[j]);
		}
		
		
		//using enhanced for loop / for each loop
		System.out.println("-using enhanced for loop-"); 
		for(Object ar:e) //using : for direct array, mostly common used
		{
			System.out.println(ar);
		}
		
	}

}
