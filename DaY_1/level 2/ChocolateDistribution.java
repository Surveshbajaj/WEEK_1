import java.util.Scanner;

public class  ChocolateDistribution{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      
        System.out.println("Enter the number of chocolates");
        int numberOfchocolates = input.nextInt(); // taking number of chocolates as input
		
		// Ask the user to enter the number2
        System.out.println("Enter the number of Children");
        int numberOfChildren = input.nextInt(); // taking number of children as input
		
		int remainingChocolates= numberOfchocolates%numberOfChildren; //calculating number of chocolates
		int chocolatesChildrenGet= numberOfchocolates/numberOfChildren; //calculating how many chocolates children will get
		

        
        System.out.println( "The number of chocolates each child gets is " + chocolatesChildrenGet +" and the number of remaining chocolates are " + remainingChocolates);
		input.close();
    }
}
