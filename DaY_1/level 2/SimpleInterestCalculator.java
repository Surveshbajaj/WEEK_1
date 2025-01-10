import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

      
        System.out.println("Enter the Principal amount");
        double principalAmount = input.nextDouble(); //taking principal Amount from user as input

      
        System.out.println("Enter the Rate of Interest (in %)");
        double rateInterest = input.nextDouble(); //taking rate of interest from user as input

     
        System.out.println("Enter the Time (in years)");
        int time = input.nextInt(); //taking time as input

       
        double simpleInterest = (principalAmount * rateInterest * time) / 100;  // Calculate the Simple Interest using the formula

       
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principalAmount +  ", Rate of Interest " + rateInterest +   " and Time " + time);
		input.close();
    }
}
