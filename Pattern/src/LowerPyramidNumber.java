
public class LowerPyramidNumber
{
	public static void main(String[] args) {
		int n=5;
		int l=1;
		int space=0;
		for(int i=0;i<n;i++)
		{
			for(int k=0;k<space;k++)
			{
				System.out.print(" ");
			}

			for(int j=0;j<n-i;j++)
			{
				System.out.print((j+l)+" ");
			}
			System.out.println();
			space++;
			l++;
		}
	}

}
