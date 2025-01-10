import java.util.Scanner;

public class FindSideOfTheSquare{
	public static void main(String args[]){
		System.out.println("perimeter");
		Scanner input = new Scanner(System.in); 
		double perimeter = input.nextDouble(); // taking perimeter from user
		
		double side = perimeter/4; // calculating sides
		System.out.print("The length of the side is "+ side +" whose perimeter is "+ perimeter);
		input.close();
	}
}