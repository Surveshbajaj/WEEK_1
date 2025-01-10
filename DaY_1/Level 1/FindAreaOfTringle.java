import java.util.Scanner;

public class FindAreaOfTringle{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		System.out.println("base");
		double base = input.nextDouble(); // taking base from user
				
		System.out.println("height");
		double height = input.nextDouble(); // taking height from user
		
		double areaInCm = (1.0/2.0)*base*height; 
		double areaInInch = areaInCm/2.54;
		double areaInFeet = areaInInch/12;
		
		
		System.out.print("Your Height in cm is "+ height + " while in feet is "+ areaInFeet+ " and inches is "+areaInInch);
		input.close();
	}
}