/*
 *@TITLE: CepeAN_MO2ProbSet01 
 * 
 * @DESCRIPTION: A program that accepts 4 inputs to be used in
 * 				 finding the value for y and prints out the value.
 * 				 It is able to process multiple sets of inputs
 * 				 which depends to the user. The program will
 * 				 use 3 formulas which are dependent to the
 * 				 value of x.
 *  
 *  @AUTHOR: Asbhy N. Cepe
 */
import java.util.Scanner;
import java.lang.Math;

public class CepeAN_MO2Probset01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double y = 0;
		
		System.out.print("Enter number of inputs to be processed: ");
		int run = input.nextInt();
		
		for(int i = 1; i<=run; i++) {
			
			System.out.println("Input "+i+":");
			System.out.print("	Enter value for a: ");
			double a = input.nextDouble();
			System.out.print("	Enter value for b: ");
			double b = input.nextDouble();
			System.out.print("	Enter value for c: ");
			double c = input.nextDouble();
			System.out.print("	Enter value for x: ");
			double x = input.nextDouble();
			
			if(x<0) {
				double cx = Math.pow(x, 4);
				y = (a+(b*x))+(c*cx);
			}else if(x==0) {
				c = Math.pow(c, 2);
				y = (a+(2*c)+(10*b))/(a+b);
			}else {
				double cx = Math.pow(x, 5);
				y = (a+(b*x)+(c*cx))/(a+1);
			}
			
			System.out.println("	The value for y is: "+ y);
		}
		
	}

}
