public class FindProfitAndLoss{
	public static void main(String args[]){
		int costPrice = 129; //cost price in INR
		int sellingPrice = 191; //selling price in INR
		double profit = sellingPrice - costPrice; // calculating profit
		double profitPercentage = (profit/costPrice)*100; // calculating profitPercentage
		System.out.println("The Cost Price is INR " + costPrice + " Selling Price is INR " + sellingPrice + " The Profit is INR " + profit + " and the Profit Percentage is "+ profitPercentage); 
		
	}
}