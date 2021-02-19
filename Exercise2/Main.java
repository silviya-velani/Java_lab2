
/**
 * 
 */

/**
 * @author silviyavelani
 *
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Defining variables
		int[] intArray = new int[]{ 1,2,3,4,5 };
		double[] doubleArray = new double[] {10.5, 5.0, 20.10};
		char c = 'a';
		
		// ArrayCalculator class object
		ArrayCalculator objArrayCalculator = new ArrayCalculator();
		 
		//Overloading function call with one variable
		objArrayCalculator.arrayTest(intArray);
		System.out.println("----------Call Overloading function with one variable----------");
		for(int i = 0; i < intArray.length; i++)
		{
			System.out.print(intArray[i] + " ");	
		}

		//Overloading function call with two variable
		objArrayCalculator.arrayTest(intArray,doubleArray);
		System.out.println("\n\n----------Call Overloading function with two variable----------");
		for(int i = 0; i < intArray.length; i++)
		{
			System.out.print(intArray[i] + " ");	
		}
		System.out.println();
		for(int i = 0; i < doubleArray.length; i++)
		{
			System.out.print(doubleArray[i] + " ");	
		}
		
		//Overloading function call with three variable
		objArrayCalculator.arrayTest(intArray,doubleArray);
		System.out.println("\n\n----------Call Overloading function with three variable----------");
		for(int i = 0; i < intArray.length; i++)
		{
			System.out.print(intArray[i] + " ");	
		}
		System.out.println();
		for(int i = 0; i < doubleArray.length; i++)
		{
			System.out.print(doubleArray[i] + " ");	
		}
		System.out.println("\n" +c);
	}

}
