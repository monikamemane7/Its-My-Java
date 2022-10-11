 /*
Q. demonstrate if-else statement of 5 subject the person who gets above 60% will be passed other wise failed output should be like Enter your name Enter marks of the 5 subject
 name = monika memane
Date = 11/10/2022
 */
	
package result;

	import java.util.Scanner;

	public class marks {
			
			public static void main(String[]args)
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the mark of the five subject");
				int sub1 = sc.nextInt();
				int sub2 = sc.nextInt();
				int sub3 = sc.nextInt();
				int sub4 = sc.nextInt();
				int sub5 = sc.nextInt();
				
				sc.close();
				
				int total;
				int percentage;
				
				//calculate total and percentage 
				total = sub1 + sub2 + sub3 + sub4 + sub5;
				
				percentage =(int)((total / 500.0) * 100);
				
				//percentage you are pass or not 
				if (percentage >=60)
				{
					System.out.println("you are pass");
				}
				else	
				{
					System.out.println("you are fail");
				}
			}
		}



