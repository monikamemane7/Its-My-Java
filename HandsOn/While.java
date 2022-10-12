/*name :- Monika
 * Date:- 12-10-22
 * Program to demonstrate while loop continues until entered number is positive 
 */

package Monika;

import java.util.Scanner;

public class While {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);// user input
	while(true)//WHILE LOOP
	{
		System.out.println("Enter the number :");
		int num = sc.nextInt();
	if(num<0)//NUM WHEN SMALLER THEN 0
	{
		System.out.println("Thankyou");
		break;
	}
		
		
	}
}}