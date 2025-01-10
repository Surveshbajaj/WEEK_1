import java.util.Scanner;

public class FindMaxNoOfHandshakes{
	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter total number of students");
		double totalStudent = input.nextDouble(); //taking total number of students from user 
		
		
		double totalHandshakes = (totalStudent*(totalStudent-1))/2; // calculating total handshakes
		

		
		System.out.println("Total number of handshakes is "+ totalHandshakes);
		input.close();
	}

}