package assign8_1;
/*
 * Stack implementation using
 * LinkedList class operations
 * such as addFirst and getFirst
 * Methods 
 */
import java.util.Iterator;
import java.util.LinkedList;

public class LinkeListStack {

	LinkedList<Object> li = new LinkedList<Object>();
	/**
	 * Adding element to the stack
	 * We should add the element 
	 * in such a way that
	 * first in last out order
	 * @param data
	 */
	public void push(Object data) {
		li.addFirst(data);
	}
	/**
	 * Popping the last element in the
	 * collection in first out order
	 */
	public void pop() {
		while(!li.isEmpty()){
			li.removeFirst();
		}
	}
    /**
     * Displaying all the stack elements
     * using the interface called iterator
     */
	public void displayStack() {
		System.out.println("  ");
		Iterator<Object> i=li.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	public static void main(String[] args) {
		LinkeListStack st = new LinkeListStack();

		st.push(50);
		st.push(70);
		st.push(190);
		st.push("dev");
		st.displayStack();
		st.pop();
		st.displayStack();
		

	}
}