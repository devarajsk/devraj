package coeassignment;

public class assignment9
{
	public static void main(String[] args) {
		int num=789;
		int temp=num;
		int rev=0;
		int sum=0;
		while(temp!=0)
		{
			rev=temp%10;
			sum=sum+rev;
			temp=temp/10;
		}
		System.out.println("the sum of all digits of "+num+" is "+sum);
	}

}
