import java.util.Scanner;

public class  WeightConverter{

    public static void main(String[] args) {

       
        Scanner input = new Scanner(System.in);

      
        System.out.println("Enter the Weight in Pounds");
       float pound = input.nextInt(); //taking weight in pound as input
		
		float kilogram = (float)(pound/2.2);  //converting the pound to kilogram

        System.out.println("The weight of the person in pound is "+pound +" and in kg is "+ kilogram);
		input.close();
    }
}
