package pharmacy;

import java.util.Scanner;

public class MainClass
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to pharmacy management system..");
		System.out.println("we are here to serve you all.....");
		customer c1= new customer("dev", 22);
		System.out.println("enter the medicine type you want...");
		String type=sc.next();
		MedicalStore md = new MedicalStore();
		md.typeOfMed(type);
		
	}

}
