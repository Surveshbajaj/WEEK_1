public class UniversityFee{
	public static void main(String args[]){
		int fee = 125000; // fee in INR
		int discountPercent = 10; // discount in percent
		double discountAmount = (fee*discountPercent)/100; // calculating the discount amount
		double feeNeedToPay = fee - discountAmount; // calculating the final amount need to pay
		
		System.out.print("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + feeNeedToPay);
	}

}