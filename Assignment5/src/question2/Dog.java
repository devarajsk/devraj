package question2;

public class Dog extends Mammals
{
	
	float height,weight;// Instance  variables
	private String breed;// Private variable
	static int noOfDogs;
	
	{// Instance initializer Block
		height=0;
		weight=0;
		System.out.println("IIB block is invoked");
	}
	
	Dog()// Default Constructor
	{
		noOfDogs++;	
	}
	public void testMethod()// Overridden method in Dog Class
	{
		System.out.println("Test Method in Dog Class");
	}
	public void getHeight()
	{
		System.out.println("Height of Dog is "+height+"cm");
	}
	public void getWeight()
	{
		System.out.println("Weight of Dog is "+weight+"kg");
	}
	public void setHeight()
	{
		this.height=65.2f;
	}
	public void setWeight() 
	{
		this.weight=80.1f;
	}

	public void getBreed() 
	{
		System.out.println("Breed of Dog is "+breed);
	}

	public void setBreed()
	{
		this.breed = "breed1";
	}
	
	public static void main(String[] args) 
	{
		Animals animalRef = new Animals();//creating animal class object
		animalRef.testMethod();
		animalRef = new Dog();
		animalRef.testMethod();
		System.out.println("No. of Animal = "+noOfAnimals+"  No. of Mammals = "+noOfMammals+" No. of Dogs = "+noOfDogs);
		Dog dg = new Dog();
		dg.setHeight();
		dg.setWeight();
		dg.setBreed();
		dg.testMethod();
		dg.getBreed();
		dg.getHeight();
		dg.getWeight();
		dg.testMethod();
		Dog dg1 = new Dog();
		System.out.println("No. of Animal = "+noOfAnimals+"  No. of Mammals = "+noOfMammals+" No. of Dogs = "+noOfDogs);
	}
}
