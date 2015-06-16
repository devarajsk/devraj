package coeassignment;

public class assignment2
{
	public static void main(String[] args) {
		double adultfare=17;
		double totaladultfare,totalchildrenfare;
		double childrenfare=0.7*adultfare;
		int numofadult=12;
		int numofchildren=9;
		totaladultfare=adultfare*numofadult;
		totalchildrenfare=childrenfare*numofchildren;
		System.out.println("total children’s fare "+((0.14*totalchildrenfare)+totalchildrenfare));
		System.out.println("total adult's fare "+((0.14*totaladultfare)+totaladultfare));
		System.out.println("total base fare ="+(((0.14*totalchildrenfare)+totalchildrenfare)+((0.14*totaladultfare)+totaladultfare)));

	}
}
