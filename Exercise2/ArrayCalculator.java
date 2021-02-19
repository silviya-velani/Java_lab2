
/**
 * 
 */

/**
 * @author silviyavelani
 *
 */

public class ArrayCalculator {
	
	//arrayTest method for one argument
	public void arrayTest(int[] arrInt)
	{
		//array elements plus 2
		for(int i = 0; i < arrInt.length; i++)
		{
			arrInt[i] += 2;
		}	
		
	}
	
	//arrayTest method for two arguments
	void arrayTest(int[] arrInt, double[] arrDouble)
	{
		//Integer array elements plus 2
		for(int i = 0; i < arrInt.length; i++)
		{
			arrInt[i] += 2;
		}
		
		//Double array element divide by 2
		for(int i = 0; i < arrDouble.length; i++)
		{
			arrDouble[i] /= 2;
		}
	}
	
	//arrayTest method for three arguments
	void arrayTest(int[] arrInt, double[] arrDouble, char c)
	{
		//Integer array elements plus 2
		for(int i = 0; i < arrInt.length; i++)
		{
			arrInt[i] += 2;
		}
				
		//Double array element divide by 2
		for(int i = 0; i < arrDouble.length; i++)
		{
			arrDouble[i] /= 2;
		}
		
		c = 'b';
	}
}