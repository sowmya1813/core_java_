package core_java_;

import java.util.Scanner;

public class Example7 {
    //Nested if-else statement
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //*** write a program to find the given number is positive or negative,if the number is positive then verify that number is even or odd //
		
		int number;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter any number (except zero(0):)");
		number=scanner.nextInt();
		
		//outer if-else
		if(number>0)
		{
			
			//inner if-else
			if (number%2==0)
			{
				System.out.println("the number is even");
				
			}
			else
			{
				System.out.println("the number is odd");
			}
		}
		else
		{
			System.out.println("the number is negative");
		}
		scanner.close();
		
	}

}
