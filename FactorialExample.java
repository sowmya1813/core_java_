package core_java_;

public class FactorialExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,fact=1;
        int number=5;//it is the number to calculate factorial
        for(i=1;i<=number;i++) {
        	fact=fact*i;
        
        }
        System.out.println("factorial of "+number+" is:"+fact);	
        	
	}

}
