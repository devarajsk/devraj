public class Assignment3_2 {
	static int index=0;
	static int[] stack = new int[10];
	static int push(int x)
	{
		int temp=0;
		if(index<9)
		{
			stack[index++]= x;
			temp =x;
		}
		else
		{
			System.out.println("Stack is already full..");
		}
		return temp;
	}
	static int pop()
	{
		int temp=0;
		if(index<0)
		{
			System.out.println("Stack already empty......");
		}
		else
		{
			temp =stack[index-1];
			stack[index--]=0;			
		}
		return temp;
	}
	static void peek()
	{
		System.out.println("the top element is "+stack[index-1]);
	}
	static void display()
	{		
		System.out.print("Elements of Stack are = [");
		for(int i=0;i<index-1;i++)
		{

			System.out.print(stack[i]+","); 
		}
		System.out.print(stack[index-1]); 
		System.out.println("]");
	}

	public static void main(String[] args)
	{
		System.out.println(push(8)+" is added to Stack");
		System.out.println(push(9)+" is added to Stack");
		System.out.println(push(4)+" is added to Stack");
		System.out.println(push(18)+" is added to Stack");
		System.out.println(push(23)+" is added to Stack");
		System.out.println(push(19)+" is added to Stack");
		peek();
		display();
		System.out.println(pop()+" is Removed from Stack");
		peek();
		display();




	}

}
