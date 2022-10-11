/*
 Q.print any multiplication table using for loop take the input from the user in all the program
 name = monika memane
 Date = 11/10/2022
 */
		
package multiply;

import java.util.Scanner;
public class table {
		
		       
			public static void main(String[] agrs)
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number: ");
				int num = sc.nextInt(); 
				for(int i = 1 ; i <= 10; ++i)
				{
					System.out.println(num+" * "+i+" = "+num*i);
				}
			}
		}

