package assign8_3;
/*
 * This class is for storing key value
 * pairs by using collection class called
 * ArrayList in the below class we have
 * methods for adding keys and values fetching
 * values by providing keys as well as
 * index number we can also have a method to get 
 * all the key set and we are checking for availability
 * of space and also displaying all the keys and
 * values that are present
 */

import java.util.ArrayList;
public class KvStore
{

	/**
	 * this is one static variable which is
	 * for setting the initial capacity of the
	 * ArrayList object
	 */
	public static int capacity=20;
	/**
	 * creating two ArrayList objects
	 * One for storing keys
	 * and other for storing values
	 */
	ArrayList<String> key;
	ArrayList<String> value;
	public KvStore() {
		 key = new ArrayList<String>(capacity);
		 value= new ArrayList<String>(capacity);
	}
	public KvStore(int cap) {
		 key = new ArrayList<String>(cap);
		 value= new ArrayList<String>(cap);
	}
	/**
	 * Put method is mainly for inserting keys
	 * and values before inserting we have to check
	 * uniqueness of the key
	 * @param ky -> the key which is going to store
	 * @param val ->the value which is going to store
	 */
	public void put(String ky,String val) {
		if(key.contains(ky))
		{
			System.out.println("key already exist .. you cant add further....");
		}
		else
		{
			key.add(ky);
			value.add(val);
		}
	}
	/**
	 * Here we are getting the proper
	 * value based on the key which is passed
	 * For this operation we have to traverse
	 * from initial index of the key
	 * @param ky
	 */
	public String get(String ky)
	{
		boolean flag=false;
		int kindex = 0;
		for(int i=0;i<key.size();i++)
		{
			if(ky.equals(key.get(i)))
			{
				System.out.println("key is found..");
				kindex=i;
				flag=true;
			}


		}
		if(flag==false)
		{
			System.out.println("ther is no such key exist...");
		}
		else
		{
			System.out.println("the value associated with key "+ky+ " is "+value.get(kindex));
		}
		return value.get(kindex);

	}
	/**
	 * This function will do the fetching
	 * operation based on the index which
	 * is passed
	 * before searching the value respect to the index
	 * we have to check weather that key index is 
	 * greater than size of key arrayList
	 * @param getindex
	 */
	public void get(int getindex)
	{
		if(getindex<key.size())
		{
			System.out.println("the value associated with index "+" " +getindex+" is " +value.get(getindex));
		}
	}
	/**
	 * Removing the value element based
	 * on the key passed.
	 * before going to remove value
	 * we should check of the key
	 * which is passed is available on the 
	 * list are not
	 * @param ky
	 */
	public void remove(String ky)
	{
		if(key.contains(ky))
		{
			int index=key.indexOf(ky);
			key.remove(index);
			value.remove(index);
		}
		else
		{
			System.out.println("there is no such key exists..");
		}
	}
	/**
	 * Showing all the elements of the 
	 * key value list
	 */
	public void showAll()//fetching all keys and values
	{
		System.out.println("keys and values are....");
		for(int i=0;i<key.size();i++)
		{
			System.out.println(key.get(i)+"----->"+value.get(i));
		}
	}
	public int showSpaceAvailabile()//space availability
	{
		return capacity-key.size();

	}
	public boolean isEmpty()
	{
		if(key.isEmpty())
		{
			return true;
					
		}
		else
		return false;
	}
	public ArrayList<String> getKeySet()
	{
		return key;
	}
	public static void main(String[] args) {
		System.out.println("welcome........");
		KvStore as  = new KvStore();
		as.put("1", "one");
		as.put("2", "two");
		as.put("3", "three");
		as.put("4", "four");
		as.put("5", "five");
		as.get("1");
		as.get(1);
		as.showAll();
		ArrayList<String> ar = as.getKeySet();
		System.out.println(ar);
		int space=as.showSpaceAvailabile();
		System.out.println("the space available is "+space);
	}



}
