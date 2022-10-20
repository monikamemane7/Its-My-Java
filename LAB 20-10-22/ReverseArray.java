/*
Question : Reverse order in array.
Name : Monika memane
date : 20/10/2022.



package Monika;

import java.util.*;

public class ReverseArray {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number of element in array ");
		
		int b = sc.nextInt();
		int array[]=new int[b];
		int rev[]=new int [b];
		
		System.out.println("enter the elements ");
		
		for(int i =0;i<b;i++) {
			array[i]=sc.nextInt();
			
		}
		System.out.println("Reverse of array is  ");
		int j=0;
		for(int i =b;i>0;i--,j++) {
			
			rev[j]=array[i-1];
			System.out.println(rev[j]);
			
		}
		
		
		
		
		
		}


}
