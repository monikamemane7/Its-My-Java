package Monika;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AccendingDecending_Array {
	
	public static void main(String[]args) //main method
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the no of element in array ");
		
		int num = sc.nextInt();
		
		Integer Array[]=new Integer [num];
		
		System.out.println("enter the elements ");
		
		for(int i =0;i<num;i++)
		{
			Array[i]=sc.nextInt();
			
		}
		System.out.println("Original array"+Arrays.toString(Array));
		
		Arrays.sort(Array);
		System.out.println("accending order is"+Arrays.toString(Array));
		
		System.out.println("Original array"+Arrays.toString(Array));
		
		Arrays.sort(Array,Collections.reverseOrder());
		System.out.println("Decending is"+Arrays.toString(Array));
	}
		

}

