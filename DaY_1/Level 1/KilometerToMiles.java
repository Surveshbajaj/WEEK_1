import java.util.Scanner;

public class KilometerToMiles{
	public static void main(String args[]){
		System.out.print("Enter km");
		Scanner input = new Scanner(System.in);
		double kilometers = input.nextDouble(); // taking from user
		
		double miles = kilometers * 0.621371; //converting kilometer to mile
		System.out.print("The total miles is "+ miles + " mile for the given km " + kilometers);
		input.close();
	}
}