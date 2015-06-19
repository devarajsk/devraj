package question2;

public abstract class Mammals extends Animals// abstract method
{
	static String Message;//Static field
	static int noOfMammals;// static field
	Mammals()// Default Constructor
	{
		noOfMammals++;
		System.out.println("New Mammal is born..");
	}

	static// Static Initializer Block
	{
		Message = "SIB of Mammals class is invoked..";
		System.out.println();
	}
	
	public void testMethod()// Overridden method in Mammals Class
	{
		System.out.println("Test Method in Mammals Class");
	}
	public abstract void getHeight();//abstract method
	public abstract void getWeight();//abstract method
	public abstract void setHeight();//abstract method
	public abstract void setWeight();//abstract method

}
