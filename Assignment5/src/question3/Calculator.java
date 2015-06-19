package question3;

public class Calculator implements OperationInterface {
	public double addition(double... d)//addition method to n number of input
	{
		double sum=0;
		for(double dl:d)
		{
			sum=sum+dl;
		}
		System.out.println("Addition result "+sum);
		return sum;

	}
	public void division(double d1,double d2)//division operation
	{
		if(d1>d2)//checking for bigger one
		{
			double result = d1/d2;
			System.out.println("Division result "+result);
		}
		else
		{
			System.out.println("inavlid input..");
		}

	}
	public void substraction(double d1,double d2)//substraction logic 
	{
		double result = d1-d2;
		System.out.println("Substraction result "+result);

	}
	public void multiplication(double... d)//multiplication of N numbers
	{
		double mul=0;
		for(double dl:d)
		{
			mul=mul*dl;
		}
		System.out.println("Multiplication result "+mul);

	}

	public void averages(double... d) //averages of n numbers
	{
		double sum=0;
		int count=0;
		for(double d1:d)
		{
			sum=sum+d1;
			count++;
		}
		double avg=sum/count;
		System.out.println("The average of numbers are "+avg);

	}

	public int GCD(int number1, int number2) //finding gcd here
	{
		//base case
		if(number2 == 0){
			return number1;
		}
		return GCD(number2, number1%number2);
	}


	public int LCM(int d1,int d2)//finding lcm 
	{
		int gc=GCD(d1,d2);
		int lcm=(d1*d2)/gc;
		return lcm;

	}

	public void squareRoot(double d)//finding the square root of the number
	{
		double g1;
		double squareRoot = d/2;
        do
        {
            g1=squareRoot;
            squareRoot = (g1 + (d/g1))/2;
        }
        while((g1-squareRoot)!=0);
        System.out.println("square root of "+d+" is "+squareRoot);

	}

	public void square(int d)//square of a number
	{
		System.out.println("square of "+d+" is "+d*d);

	}
	public void log(double n)
	{
		System.out.println("logerithm of "+n+ " is "+Math.log(n));
	}
	
public static void main(String[] args)
{
	Calculator cl= new Calculator();
	System.out.println("welcome to calculator ....");
	cl.addition(1.0,2.5,3.6);
	cl.addition(1,2);
	cl.substraction(90, 10);
	cl.substraction(82.0, 78.0);
	cl.multiplication(12,89,9);
	cl.division(19, 89);
	System.out.println("gcd of numbers "+cl.GCD(2,4));
	System.out.println("lcm of numbers "+cl.LCM(6,3));
	cl.log(10);
	
}

}
