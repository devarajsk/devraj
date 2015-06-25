package assign8_1;
/*
 * Stack implementation using
 * ArrayList class operations
 * such as addFirst and getFirst
 * Methods 
 */
import java.util.ArrayList;

public class ArrayListStack
{
	ArrayList< String> al = new ArrayList<String>();
	/**
	 * Adding element to the stack
	 * We should add the element 
	 * in such a way that
	 * first in last out order
	 * @param data
	 */
	public void push(String str)
	{
		al.add(str);
	}
	/**
	 * Popping the last element in the
	 * collection in first out order
	 */
	public void pop()
	{
		if(!al.isEmpty())
		{
			al.remove(al.size()-1);
			System.out.println("popping is done..");
		}
		else
		{
			System.out.println("Stack is empty");
		}
	}
	/**
     * Displaying all the stack elements
     * using the for loop
     */
	public void display()
	{
		System.out.println("STACK elements are");
		System.out.println("*******************");
		for(int i=al.size()-1;i>=0;i--)
		{
			System.out.println(al.get(i));
		}
		System.out.println("*******************");
	}
	public static void main(String[] args) {
		ArrayListStack als= new ArrayListStack();
		als.push("dev");
		als.push("yash");
		als.push("karthik");
		als.push("shivu");
		als.push("mahesh");
		als.display();
		als.pop();
		als.display();
		
	}
}
