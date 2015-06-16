package coeassignment;

public class pattern2
{
	public static void main(String[] args) {
		int num=5;
		int star=1;
		int space=num-1;
		for(int i=0;i<num;i++)
		{
			for(int k=0;k<space;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<star;j++)
			{
				if(j%2==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			if(i<num/2)
			{
				space--;
				star=star+2;
			}
			else
			{
				space++;
				star=star-2;
			}
			System.out.println();
		}
	}

}
