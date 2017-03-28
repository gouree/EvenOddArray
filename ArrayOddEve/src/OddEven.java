import java.util.*;
public class OddEven {

	public static void main(String args[])
	{
		
		System.out.println("hello");
		Check c = new Check();
		c.getArray();
		c.displayArray();
		c.even();
		c.odd();
		
	}
}

class Check
{
	int i,n;
	int a[]= new int[10];
	Scanner input= new Scanner(System.in);
	
	void getArray()
	{
		System.out.println("Enter array elements --->");
		for(i=0;i<10;i++)
		{
			a[i]= input.nextInt();
		}
	}

	void displayArray()
	{
		System.out.println(" array elements --->");
		for(i=0;i<10;i++)
		{
			System.out.print(a[i]+"   ");
		}
	}
	
	void even()
	{
		System.out.println(" ");
		System.out.println("Even Numbers in the array");
		for(i=0;i<10;i++)
		{ 
			if(a[i]%2==0)
			{
				System.out.print(a[i]+"     ");
			}
		}
	}
	
	void odd()
	{
		System.out.println("");
		System.out.println("Odd Numbers in the array");
		for(i=0;i<10;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.print(a[i]+"    ");
			}
		}
	}
	
}

