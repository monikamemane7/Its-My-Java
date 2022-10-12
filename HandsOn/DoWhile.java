/*name :- Monika
 * Date:- 12-10-22
 * Program to demonstrate (do-while)and print the reverse counting from the user 
 */



package Monika;
import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num1 = sc.nextInt();
		
		do
		{
			System.out.println(num1);
			num1--;

		}
		while(num1>=0);
	}
}
