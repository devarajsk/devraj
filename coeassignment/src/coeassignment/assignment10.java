package coeassignment;

public class assignment10 
{
	public static void main(String[] args) {
		int num=789;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("the reversed number is "+rev);
	}

}
