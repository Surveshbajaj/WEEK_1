import java.util.Scanner;


public class CentimeterToIncheAndFeet{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in); 
		System.out.println("height");
		double height = input.nextDouble(); //taking height in cm
		double inches = height/2.54; // converting height into inches
		double feet = inches/12; // converting height into feet
		
		System.out.print("Your height in cm is "+ height + " while in feet is "+ feet + " and inches is "+ inches);
		input.close();
	}

}