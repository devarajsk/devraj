package question2;

public  class Animals // Animal Abstract class
{
	static int noOfAnimals;// static field
	public Animals()// Default constructor
	{
		noOfAnimals++;
		System.out.println("Just now new Animal is born..");
	}
	
	public void testMethod()// concrete method
	{
		System.out.println("Test Method in Animal Class");
	}
	float weight=0;
	float hieght=0;
}
