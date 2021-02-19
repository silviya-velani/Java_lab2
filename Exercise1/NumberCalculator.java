
/**
 * 
 */

/**
 * @author silviyavelani
 *
 */

public class NumberCalculator {

	// TODO Overloading Methods
	public void processNum(int num1, int num2) {
		
		System.out.println("Addition of " +num1 +" and " +num2 +" is " +(num1 + num2));
		System.out.println("Subtraction of " +num1 +" and " +num2 +" is " +(num1 - num2));
		System.out.println("Multiplication of " +num1 +" and " +num2 +" is " +(num1 * num2));
		System.out.println("Division of " +num1 +" and " +num2 +" is " +((double)num1 / num2));
			
	}
	
	public void processNum(int num1, float num2) {
		
		System.out.println("Addition of " +num1 +" and " +num2 +" is " +((float)num1 + num2));
		System.out.println("Subtraction of " +num1 +" and " +num2 +" is " +((float)num1 - num2));
		System.out.println("Multiplication of " +num1 +" and " +num2 +" is " +((float)num1 * num2));
		System.out.println("Division of " +num1 +" and " +num2 +" is " +((double)num1 / num2));
			
	}
	
	public void processNum(int num1, double num2) {
		
		System.out.println("Addition of " +num1 +" and " +num2 +" is " +((double)num1 + num2));
		System.out.println("Subtraction of " +num1 +" and " +num2 +" is " +((double)num1 - num2));
		System.out.println("Multiplication of " +num1 +" and " +num2 +" is " +((double)num1 * num2));
		System.out.println("Division of " +num1 +" and " +num2 +" is " +((double)num1 / num2));
			
	}
	
	public void processNum(float num1, int num2) {
		
		System.out.println("Addition of " +num1 +" and " +num2 +" is " +(num1 + (float)num2));
		System.out.println("Subtraction of " +num1 +" and " +num2 +" is " +(num1 - (float)num2));
		System.out.println("Multiplication of " +num1 +" and " +num2 +" is " +(num1 * (float)num2));
		System.out.println("Division of " +num1 +" and " +num2 +" is " +(num1 / (double)num2));
		
	}

	public void processNum(float num1, float num2) {
		
		System.out.println("Addition of " +num1 +" and " +num2 +" is " +(num1 + num2));
		System.out.println("Subtraction of " +num1 +" and " +num2 +" is " +(num1 - num2));
		System.out.println("Multiplication of " +num1 +" and " +num2 +" is " +(num1 * num2));
		System.out.println("Division of " +num1 +" and " +num2 +" is " +((double)num1 / num2));
		
	}
	
	public void processNum(float num1, double num2) {
		
		System.out.println("Addition of " +num1 +" and " +num2 +" is " +((double)num1 + num2));
		System.out.println("Subtraction of " +num1 +" and " +num2 +" is " +((double)num1 - num2));
		System.out.println("Multiplication of " +num1 +" and " +num2 +" is " +((double)num1 * num2));
		System.out.println("Division of " +num1 +" and " +num2 +" is " +((double)num1 / num2));
			
	}
	
	public void processNum(double num1, int num2) {
		
		System.out.println("Addition of " +num1 +" and " +num2 +" is " +(num1 + (double)num2));
		System.out.println("Subtraction of " +num1 +" and " +num2 +" is " +(num1 - (double)num2));
		System.out.println("Multiplication of " +num1 +" and " +num2 +" is " +(num1 * (double)num2));
		System.out.println("Division of " +num1 +" and " +num2 +" is " +(num1 / (double)num2));
		
	}

	public void processNum(double num1, float num2) {
		
		System.out.println("Addition of " +num1 +" and " +num2 +" is " +(num1 + (double)num2));
		System.out.println("Subtraction of " +num1 +" and " +num2 +" is " +(num1 - (double)num2));
		System.out.println("Multiplication of " +num1 +" and " +num2 +" is " +(num1 * (double)num2));
		System.out.println("Division of " +num1 +" and " +num2 +" is " +(num1 / (double)num2));
		
	}

	public void processNum(double num1, double num2) {
		
		System.out.println("Addition of " +num1 +" and " +num2 +" is " +(num1 + num2));
		System.out.println("Subtraction of " +num1 +" and " +num2 +" is " +(num1 - num2));
		System.out.println("Multiplication of " +num1 +" and " +num2 +" is " +(num1 * num2));
		System.out.println("Division of " +num1 +" and " +num2 +" is " +(num1 / num2));
		
	}
	
	
	
	//Parsing of numbers
	public boolean tryIntParse(String value) {
	    try {
	        Integer.parseInt(value);
	        return true;
	    } catch (NumberFormatException e) {
	    	System.out.println("You have entered invalid integer.");
	        return false;
	    }
	}
	
	public boolean tryFloatParse(String value) {
	    try {
	        Float.parseFloat(value);
	        return true;
	    } catch (NumberFormatException e) {
	    	System.out.println("You have entered invalid float.");
	        return false;
	    }
	}
	
	public boolean tryDoubleParse(String value) {
	    try {
	        Double.parseDouble(value);
	        return true;
	    } catch (NumberFormatException e) {
	    	System.out.println("You have entered invalid double.");
	        return false;
	    }
	}
}
