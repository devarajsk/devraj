package assign8_2;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * Queue implementation using
 * LinkedList class operations
 * such as addFirst and getLast
 * Methods 
 */
public class LinkListQueue {
	LinkedList ls = new LinkedList();
	/**
	 * Here inserting the queue element
	 * as the head element
	 * it says we shoul add the any new 
	 * element to the queue only  
	 * @the the last
	 * @param data
	 */
	public void insert(Object data)
	{
		ls.addLast(data);
	}
	/**
	 * Deleting queue element
	 * Here we have to delete the
	 *  element which is added first..
	 *  Before deleting any elements 
	 *  we have to check the status of the 
	 *  queue...
	 *  wether the queue is empty are not 
	 */
	public void delete()
	{
		if(!ls.isEmpty())
		{
			ls.removeLast();
		}
	}
	/**
	 * Here we are finding the element
	 * which is going to delete from
	 * the queue in the next delete operation
	 */
	public void peek()
	{
		Object obj=ls.getLast();
		System.out.println(obj);
	}
	/**
	 * Here displaying all the 
	 * elements of the Queue using
	 * an Interface called Iterator 
	 * 
	 */
	public void display()
	{
		Iterator i=ls.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	public static void main(String[] args) {
		LinkListQueue lq= new LinkListQueue();
		lq.insert("dev");
		lq.insert("chethu");
		System.out.println("All elements of queue");
		lq.display();
		System.out.println("head element");
		lq.peek();
		lq.delete();
		System.out.println("head element");
		lq.peek();
		System.out.println("All elements of queue");
		lq.display();
	}
}
