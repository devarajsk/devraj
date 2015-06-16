
public class ReverseStar 
{
	public static void main(String[] args) 
	{
		int num=6;
		for(int i=1;i<=num;i++)
		{
			for(int j=i-1;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=num-(i-1);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
