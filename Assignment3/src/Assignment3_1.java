import java.util.Scanner;

public class Assignment3_1 
{
	public static void main(String[] args) {
		int[] ar=new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 6 digit integer number");
		int num=sc.nextInt();
		int temp=num;
		int rem=0;
		int i=0;
		while(temp!=0)
		{
			rem=temp%10;
			ar[i]=rem;
			temp=temp/10;
			i++;

		}
		System.out.print("Elements of Array in Reverse Order are = [");
		for( i=0;i<ar.length-1;i++)
		{
			
			System.out.print(ar[i]+","); 
		}
		System.out.print(ar[ar.length-1]); 
		System.out.print("]");
	}

}
