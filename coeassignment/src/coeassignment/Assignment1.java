package coeassignment;

public class Assignment1 
{
	public static void main(String[] args) {
		String name="birendra";
	    //float f1=(float)name;//we can't cast string to float because both are different primitives 
		byte small=15;
		short sh=small;
		int num=sh;
		long ln=num;
		float fl=ln;
		double dl=fl;
		System.out.println("byte value is "+small);//printing short value
		System.out.println("short value is "+sh);
		System.out.println("int value is "+num);
		System.out.println("long value is "+ln);
		System.out.println("float value is "+fl);
		System.out.println("double value is "+dl);
		
		System.out.println("**********************************");
		double number = 12312.12119;
		float f=(float)number;//explicit type casting is required
		long l=(long)f;//explicit type casting is required
		int num1=(int)l;
		short shrt=(short)num1;
		byte bt=(byte)shrt;
		System.out.println("double value is "+number);
		System.out.println("float value is "+f);
		System.out.println("long value is "+l);
		System.out.println("integer value is "+num1);
		System.out.println("short value is "+shrt);
		System.out.println("byte value is "+bt);
		System.out.println("***********************************");
		
	}

}
