import java.util.Scanner;

public class Assignment3_3 
{
	static Scanner sc = new Scanner(System.in);
	static int MAX= 10;
	static int[] queue_array= new int [MAX];
	static int rear = - 1;
	static int front = - 1;
	static void insert()
	{
		int add_item;
		if (rear == MAX - 1)
		{
			System.out.println("Queue Overflow");
		}
		else
		{
			if (front == - 1)
				/*If queue is initially empty */
				front = 0;
			System.out.println("Inset the element in queue : ");
			add_item=sc.nextInt();
			rear = rear + 1;
			queue_array[rear] = add_item;
		}
	} 

	static void delete()
	{
		if (front == - 1 || front > rear)
		{
			System.out.println("Queue Underflow");
			return ;
		}
		else
		{
			System.out.println("Element deleted from queue is : "+ queue_array[front]);
			front = front + 1;
		}
	}
	static void display()
	{
		int i;
		if (front == - 1)
			System.out.println("Queue is empty");
		else
		{
			System.out.println("Queue is : ");
			for (i = front; i <= rear; i++)
				System.out.println(queue_array[i]);
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		int choice;
		while (true)
		{
			System.out.println("1.Insert element to queue");
			System.out.println("2.Delete element from queue");
			System.out.println("3.Display all elements of queue");
			System.out.println("Enter your choice : ");
			choice=sc.nextInt();
			switch (choice)
			{
			case 1:
				insert();
				break;
			case 2:
				delete();
				break;
			case 3:
				display();
				break;
			default:
				System.out.println("Wrong choice");
			} 
		}
	}

}
