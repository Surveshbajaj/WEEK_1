import java.util.Scanner;

public class CalculateTotalPrice{
	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		System.out.println("unit price");
		double unitPrice = input.nextDouble(); //taking unit price from user 
		
		System.out.println("quantity");
		double quantity = input.nextDouble(); // taking quantity from user
		
		double totalPrice = quantity*unitPrice;
		
		System.out.println("The total purchase price is INR" + totalPrice +" if the quantity "+ quantity +" and unit price is INR " + unitPrice);
		input.close();
	}

}