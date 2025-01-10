import java.util.Scanner;

public class BasicCalculater{
	public static void main(String args[]){
		System.out.println("number1, number2");
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt(); //taking number1 from user
		int number2 = input.nextInt(); //taking number2 from user
		int addition = number1+number2; // perform additon
		int subtraction = number1 - number2; // perform subtraction
		int multiplication = number1 * number2; // perform multiplication
		int division = number1/number2; // perform division
		
		System.out.print("The addition, subtraction, multiplication and division value of 2 numbers "+ number1 +" and "+ number2 + " is " + addition+", "+ subtraction+", "+ multiplication + ", and " +division);
		input.close();
	}
}