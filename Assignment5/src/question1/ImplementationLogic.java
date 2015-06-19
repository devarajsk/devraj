package question1;
import java.math.BigInteger;// importing bigInteger Class for bigInt data Type

public class ImplementationLogic implements BaseLogic // Inheriting the Interface Baselogic
{
	public ImplementationLogic(int... number) // Parameterized constructor for taking n number of inputs
	{
		for (int n : number) // for each loop
		{
			if(n<100||n>9999)// Checking the range of Number
			{
				System.out.println("The No. "+n+" is invalid. It should be 3 or 4 digit number.");
			}
			else
			{
				allOperations(n);// Calling All the functions...
			}
		}
	}
	void allOperations(int n)
	{
		System.out.println("Sum of digits are = "+sumOfDigits(n));
		reverse(n);
		factorial(n);
		average(n);
		pritPattern(n);

	}
	public int sumOfDigits(int n)
	{
		int temp=n;// local variables
		int sum =0;
		while(temp!=0)
		{
			sum = sum+(temp%10);
			temp=temp/10;
		}

		return sum;
	}
	public void reverse(int n)
	{

		int temp=n;// local variables
		int rev=0;
		while(temp!=0)
		{
			rev=(rev*10)+(temp%10);
			temp=temp/10;
		}
		System.out.println("Reverse of num "+n+" is = "+rev);

	}
	public void factorial(int n) 
	{
		int num=n;// local variables
		BigInteger fact = new BigInteger("1");
		for (int i = 1; i <= num; i++) {
			fact = fact.multiply(new BigInteger(i + ""));// multiply method of java.Math package
		}
		System.out.println("Factorial of  No. "+n+" is "+ fact);
	}

	public void average(int n) 
	{
		int temp=n;// local variables
		int divider=0;
		while(temp!=0)
		{
			divider++;
			temp=temp/10;
		}
		int avg=sumOfDigits(n)/divider;
		System.out.println("Average of digits of the number "+n+ " is "+avg);
	}

	public void pritPattern(int n)
	{
		int temp=n;// local variables
		int last=temp%10;
		if((last==1)||(last==2))// Checking for last Digit of the Number 
		{
			printStar(last*3);// Calling printStar Method for Printing Pattern
		}
	}

	public void printStar(int n)// Printing Star
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		ImplementationLogic iml = new ImplementationLogic(123,122,1);// Creating object and calling constructor with passing n number of parameters 
	}

}
