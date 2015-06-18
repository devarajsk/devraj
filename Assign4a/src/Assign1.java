

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

public class Assign1 
{
	int keyindex=0;
	int valueindex=0;
	String[] key;
	String[] value;
	/*default constructor which will allow us to create arrays of key
	 * and values with default size 20  */
	public Assign1() {
		key=new String[20];
		value= new String[20];
		System.out.println("default constructor is invoked......");
	}
	/*user defined one we can initialize with our convenient*/
	public Assign1(String[] key,String[] value) {
		this.key=key;
		this.value= value;
		System.out.println("parameterized constructor is invoked with key size "+key+" and value size "+value);
	}
	/*before adding key and value pair we are checking uniqueness of key string and size of key array*/
	public void put(String ky,String val) {
		if(keyindex<key.length)//checking stack status
		{
			boolean flag=false;
			for(int i=0;i<keyindex;i++)//duplication 
			{
				if(key[i].equals(ky))
				{
					flag=true;
				}

			}
			if(flag==false)
			{
				key[keyindex++]=ky;
				value[valueindex++]=val;
				System.out.println("key and values are added...");

			}
			else
			{
				System.out.println("key should be unique.....");
			}
		}
		else
		{
			System.out.println("you can't add further because stack is full...");
		}

	}
	/* fetching value with respect to the given key*/
	public void get(String key)
	{
		boolean flag=false;
		int kindex = 0;
		for(int i=0;i<keyindex;i++)
		{
			if(this.key[i].equals(key))
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
			System.out.println("the value associated with key "+key+ " is "+value[kindex]);
		}

	}
	/* fetching value based on index*/
	public void get(int n)
	{
		if(n<valueindex)
		{
			System.out.println("value present in "+n+"th index is "+value[n]);
		}
		else
		{
			System.out.println("value index is out of bound....");
		}
	}
	/*removing value associated with given key.......*/
	void remove(String ky)
	{
		int temp=0;
		if(keyindex<0)
		{
			System.out.println("both key and value arrays already empty... not possible to remove further...");
		}
		else
		{
			for(int i=0;i<keyindex;i++)
			{
				if(key[i].equals(ky))
				{
					temp=i;
				}
			}
			key[temp]=null;
			value[temp]=null;
			System.out.println("removed......");
		}
	}
	public void sort(Boolean basedOnKey, Boolean asc) {
		if (basedOnKey) {
			if (asc) {

				for (int i = 0; i < key.length; i++) {
					if (key[i] != null) {
						for (int j = i + 1; j < key.length; j++) {

							if (key[j].compareTo(key[i]) < 0) {
								String temp = key[i];
								String tval = value[i];
								key[i] = key[j];
								value[i] = value[j];
								key[j] = temp;
								value[j] = tval;

							}
						}

					}
				}
			} else {
				for (int i = 0; i < key.length; i++) {
					for (int j = i + 1; j < key.length; j++) {
						if (key[j].compareTo(key[i]) > 0) {
							String temp = key[i];
							String tval = value[i];
							key[i] = key[j];
							value[i] = value[j];
							key[j] = temp;
							value[j] = tval;

						}
					}
				}

			}
		} else {
			if (asc) {
				for (int i = 0; i < value.length; i++) {
					for (int j = i + 1; j < value.length; j++) {
						if (value[j].compareTo(value[i]) < 0) {
							String temp = key[i];
							String tval = value[i];
							key[i] = key[j];
							value[i] = value[j];
							key[j] = temp;
							value[j] = tval;

						}
					}
				}
			} else {
				for (int i = 0; i < value.length; i++) {
					for (int j = i + 1; j < value.length; j++) {
						if (value[j].compareTo(value[i]) > 0) {
							String temp = key[i];
							String tval = value[i];
							key[i] = key[j];
							value[i] = value[j];
							key[j] = temp;
							value[j] = tval;
						}
					}
				}

			}

		}
	}

public void showAll()//fetching all keys and values
{
	System.out.println("keys and values are....");
	for(int i=0;i<keyindex;i++)
	{
		System.out.println(key[i]+"----->"+value[i]);
	}
}
public int showSpaceAvailabile()//space availability
{
	return key.length-keyindex;

}
/* checking emptyness of arrays*/
public boolean isEmpty()
{
	if(keyindex<0)
	{
		return true;
	}
	else
	{
		return false;
	}
}
/* getting key set reference */
public String[] getKeySet()
{
	String[] str = new String[keyindex];
	for(int i=0;i<keyindex;i++)
	{
		str[i]=key[i];

	}
	return str;
}
public static void main(String[] args) {
	System.out.println("welcome........");
	Assign1 as  = new Assign1();
	as.put("dev", "cpg");
	as.put("bang", "bangalore");
	as.put("bang", "bangalore");
	as.put("bang", "bangalore");
	as.put("bang", "bangalore");
	as.put("bang", "bangalore");
	as.put("bang", "bangalore");
	as.put("ch", "channai");
	//as.get("dev");
	//as.get(2);
	as.showAll();
	System.out.println("currently we have "+as.showSpaceAvailabile()+ " spaces are avialable");
	
	as.get("dev");
	as.sort(true, true);
	System.out.println("emptyness of stack is "+as.isEmpty());
	System.out.println("key set references "+as.getKeySet());
	as.remove("dev");
}

}
