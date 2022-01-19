package core_java_;

import java.util.Scanner;

public class LcmandHcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int temp1,temp2,num1,num2,temp,hcf,lcm;
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("enter first number:");
        num1=scanner.nextInt();
        System.out.println("enter second number:");
        num2=scanner.nextInt();
        scanner.close();
        
        temp1=num1;
        temp2=num2;
        
        while(temp2 !=0) {
        	temp=temp2;
        	temp2=temp1%temp2;
        	temp1=temp;
        	
        }
        
        hcf=temp1;
        lcm=(num1*num2)/hcf;
        
        System.out.println("hcf of two numbers:"+hcf);
        System.out.println("lcm of two numbers:"+lcm);
        
        
	}
	

}
