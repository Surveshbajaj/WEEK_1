import java.util.Scanner;

public class UniversityFees{
	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		System.out.println("fee, discountPercent");
		int fee = input.nextInt(); // taking fee from user 
		int discountPercent = input.nextInt(); // taking discount amount from user
		double discountAmount = (fee*discountPercent)/100; //calculating the discount amount
		double finalFee = fee - discountAmount; // calculating the final fee that need to pay
		
		System.out.print("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
		input.close();
	}

}