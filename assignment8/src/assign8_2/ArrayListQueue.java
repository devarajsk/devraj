package assign8_2;

import java.util.ArrayList;
import java.util.Iterator;

import assign8_1.ArrayListStack;

/*
 * Queue implementation using
 * LinkedList class operations
 * such as addFirst and getLast
 * Methods 
 */
public class ArrayListQueue {
	ArrayList<String> al = new ArrayList<String>();
	/**
	 * Here inserting the queue element
	 * as the head element
	 * it says we should add the any new 
	 * element to the queue only  
	 * @the the last
	 * @param data
	 */
	public void insert(String obj)
	{
		al.add(obj);
	}
	/**
	 * Deleting queue element
	 * Here we have to delete the
	 *  element which is added first..
	 *  Before deleting any elements 
	 *  we have to check the status of the 
	 *  queue...
	 *  Whether the queue is empty are not 
	 */
	
	public void delete()
	{
		if(!al.isEmpty())
		{
			al.remove(0);
			System.out.println("deleting of head element is done....");
		}
		else
		{
			System.out.println("Que is already empty");
		}
	}
	/**
	 * Here we are finding the element
	 * which is going to delete from
	 * the queue in the next delete operation
	 */
	public void peek()
	{
		Object obj=al.get(0);
		System.out.println("peek element is "+obj);
	}
	/**
	 * Here displaying all the 
	 * elements of the Queue using
	 * an Interface called Iterator 
	 * 
	 */
	public void display()
	{
		System.out.println("QUEUE elements are...");
		System.out.println("**********************");
		for(int i=al.size()-1;i>=0;i--)
		{
			System.out.println(al.get(i));
		}
		System.out.println("**********************");
	}
	
	public static void main(String[] args) {
		ArrayListQueue alq= new ArrayListQueue();
		alq.insert("dev");
		alq.insert("yash");
		alq.insert("karthik");
		alq.insert("shivu");
		alq.insert("mahesh");
		alq.display();
		alq.delete();
		alq.display();
	}
	
}
