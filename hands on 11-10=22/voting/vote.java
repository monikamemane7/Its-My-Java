/*
	 Q.Test whether the person is eligible to give vote using(if-else)
	 name = monika memane
	 Date = 11/10/2022 
		 */

	package voting;
	import java.util.Scanner;
	public class vote {
	
			
			public static void main(String []args) {
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter age:");
				
				int age = sc.nextInt();
				if
				((age>=18)&&(age<+100))
				{
					System.out.println("you are eligible for voting");
				}
				else
				{
					System.out.println("you are not eligible for voting");
				}
				
			}
		}

