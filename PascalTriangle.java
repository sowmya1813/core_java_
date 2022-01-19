package core_java_;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("enter the row of pascal triangle:");
         Scanner scanner=new Scanner(System.in);
          int numRow =scanner.nextInt();
           for (int i=1; i<=numRow;i++) {
        	   //print the blank spaces
        	   for(int j=1;j<=numRow-i;j++) {
        		   System.out.println("");
        		   
        	   }
        	   //print the value of the number
        	   for(int k =1;k<=i;k++) {
        		   System.out.println(i +" ");
        		   
        	   }
        	  System.out.println();
           }
         
        
	}
}