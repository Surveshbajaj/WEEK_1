import java.util.Scanner;

public class FindTheDistanceInYards{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter distance in feet");
		double distance = input.nextDouble(); // taking distance in feet from user
		double yards = distance/3; // calculating yards
		double miles = yards/1760; // calculating miles
		
		System.out.println("distance in feet "+ distance +" while in yards " +yards + " and in miles " + miles );
		
		input.close();
	}

}