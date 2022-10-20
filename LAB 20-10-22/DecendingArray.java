package Monika;
import java.util.*;

public class DecendingArray {

	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the number of element in array ");
		
		int a = input.nextInt();
		//int array[]=new int[a];
		Integer Array[]=new Integer [a];
		
		System.out.println("enter the elements ");
		
		for(int i =0;i<a;i++)
		{
			Array[i]=input.nextInt();
			
		}
		System.out.println("Original array"+Arrays.toString(Array));
		
		
		
		Arrays.sort(Array,Collections.reverseOrder());
		System.out.println("Sorted array is"+Arrays.toString(Array));
	}
}
