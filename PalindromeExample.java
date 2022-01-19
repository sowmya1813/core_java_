package core_java_;

public class PalindromeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int r,sum=0,temp;
        int n=454;//it is the number to be checked for palindrome
        temp=n;
        while(n>0) {
        r=n%10;//getting remainder
        sum=(sum*10)+r;
        n=n/10;
        
        }
        if (temp==sum)
        	System.out.println("palindrome number");
        else
        	System.out.println("not a palindrome");
	}

}
