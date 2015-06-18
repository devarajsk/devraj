package pharmacy;

public class MedicalStore 
{
	void typeOfMed(String type)
	{
		if(type.equals("eng"))
		{
			EngMEd e1= new EngMEd();
			e1.englishmedicine();
		}
		else if(type.equals("herb"))
		{
			HerbMed h1= new HerbMed();
			h1.herbal();
		}
		else
		{
			System.out.println("Medicine is not available for this type...");
		}
	}


}
