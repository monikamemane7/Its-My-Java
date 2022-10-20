/*
Question : Even Ascending order in array.
Name : Monika memane
date : 20/10/2022.


package Monika;
import java.util.*;

public class EvenAccending_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the no of element in array ");
		
		int a = sc.nextInt();
		Integer Array[]=new Integer [a];
		System.out.println("enter the elements ");
		for(int j =0;j<a;j++)
		{
			int m=sc.nextInt();
		    Array[j]=m;
			
	}      
		Arrays.sort(Array);
		System.out.println("even number in ascending order:");
		
		for(int k=0;k<a;k++)
		{
			if (Array[k]%2==0) {
				System.out.println(Array[k]+" ");
						
				
			}
			
		
		}
}

}
