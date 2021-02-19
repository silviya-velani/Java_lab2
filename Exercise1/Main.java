/**
 * 
 */

/**
 * @author silviyavelani
 *
 */

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (// Class Objects
		Scanner scanner = new Scanner(System.in)) {
			NumberCalculator myCal = new NumberCalculator();
			
			//Call Overloading functions
			System.out.println("----------Processing 2 integers----------");
			System.out.print("Please enter a integer: ");
			String preNum1 = scanner.nextLine();
			
			if (myCal.tryIntParse(preNum1)) {
				System.out.print("Please enter second integer: ");
				String preNum2 = scanner.nextLine();
				
				if (myCal.tryIntParse(preNum2)) {
					myCal.processNum(Integer.parseInt(preNum1), Integer.parseInt(preNum2));
				}
			}
			
			
			System.out.println("\n\n----------Processing integer and float----------");
			System.out.print("Please enter a integer: ");
			String preNum3 = scanner.nextLine();
			
			if (myCal.tryIntParse(preNum3)) {
				System.out.print("Please enter a float: ");
				String preNum4 = scanner.nextLine();
				
				if (myCal.tryFloatParse(preNum4)) {
					myCal.processNum(Integer.parseInt(preNum3), Float.parseFloat(preNum4));
				}
			}
			
			
			System.out.println("\n\n----------Processing integer and double----------");
			System.out.print("Please enter a integer: ");
			String preNum5 = scanner.nextLine();
			
			if (myCal.tryIntParse(preNum5)) {
				System.out.print("Please enter a double: ");
				String preNum6 = scanner.nextLine();
				
				if (myCal.tryDoubleParse(preNum6)) {
					myCal.processNum(Integer.parseInt(preNum5), Double.parseDouble(preNum6));
				}
			}
			
			
	
			
			System.out.println("----------Processing float and integer----------");
			System.out.print("Please enter a float: ");
			String preNum7 = scanner.nextLine();
			
			if (myCal.tryFloatParse(preNum7)) {
				System.out.print("Please enter a integer: ");
				String preNum8 = scanner.nextLine();
				
				if (myCal.tryIntParse(preNum8)) {
					myCal.processNum(Float.parseFloat(preNum7), Integer.parseInt(preNum8));
				}
			}
			
			
			
			System.out.println("\n\n----------Processing 2 float----------");
			System.out.print("Please enter a float: ");
			String preNum9 = scanner.nextLine();
			
			if (myCal.tryFloatParse(preNum9)) {
				System.out.print("Please enter a float: ");
				String preNum10 = scanner.nextLine();
				
				if (myCal.tryFloatParse(preNum10)) {
					myCal.processNum(Float.parseFloat(preNum9), Float.parseFloat(preNum10));
				}
			}
			
			
			
			System.out.println("\n\n----------Processing float and double----------");
			System.out.print("Please enter a float: ");
			String preNum11 = scanner.nextLine();
			
			if (myCal.tryFloatParse(preNum11)) {
				System.out.print("Please enter a double: ");
				String preNum12 = scanner.nextLine();
				
				if (myCal.tryDoubleParse(preNum12)) {
					myCal.processNum(Float.parseFloat(preNum11), Double.parseDouble(preNum12));
				}
			}
			
			
			
			
			System.out.println("----------Processing double and integer----------");
			System.out.print("Please enter a double: ");
			String preNum13 = scanner.nextLine();
			
			if (myCal.tryDoubleParse(preNum13)) {
				System.out.print("Please enter a integer: ");
				String preNum14 = scanner.nextLine();
				
				if (myCal.tryIntParse(preNum14)) {
					myCal.processNum(Double.parseDouble(preNum13), Integer.parseInt(preNum14));
				}
			}
			
			
			
			System.out.println("\n\n----------Processing double and float----------");
			System.out.print("Please enter a double: ");
			String preNum15 = scanner.nextLine();
			
			if (myCal.tryDoubleParse(preNum15)) {
				System.out.print("Please enter a float: ");
				String preNum16 = scanner.nextLine();
				
				if (myCal.tryFloatParse(preNum16)) {
					myCal.processNum(Double.parseDouble(preNum15), Float.parseFloat(preNum16));
				}
			}
			
			
			
			System.out.println("\n\n----------Processing 2 double----------");
			System.out.print("Please enter a double: ");
			String preNum17 = scanner.nextLine();
			
			if (myCal.tryDoubleParse(preNum17)) {
				System.out.print("Please enter a double: ");
				String preNum18 = scanner.nextLine();
				
				if (myCal.tryDoubleParse(preNum18)) {
					myCal.processNum(Double.parseDouble(preNum17), Double.parseDouble(preNum18));
				}
			}
			
		}
			
	}	

}
