package core_java_;

import java.util.Scanner;

public class Example8 {
    //if-else laddar
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int marks;
         Scanner scanner=new Scanner(System.in);
         System.out.println("enter your marks(*out of 100):");
         
         marks=scanner.nextInt();
         if(marks<=100 && marks>=70)
         {
        	 System.out.println("distinction");
        	
         }
         else if(marks< 70 && marks>=60)
         {
        	 System.out.println("first class");
         }
         else if(marks< 60 && marks>=50)
         {
        	 System.out.println("second class");
         }
         else if (marks<50 && marks >=41)
         {
        	 System.out.println("third class");
         }
         else if (marks==40)
         {
        	 System.out.println("pass");
         }
         else
         {
        	 System.out.println("fail");
         }
         scanner.close();
	}

}
