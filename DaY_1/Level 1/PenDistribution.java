public class PenDistribution{
	public static void main(String args[]){
		int totalPen = 14, totalStudent = 3; //Total number of pens and Total number of students
		int penPerStudent = totalPen/totalStudent; // finding the number of pens per student 
		int remainingPen = totalPen%totalStudent; // finding the remaining pens
		System.out.print("The Pen per Student is " + penPerStudent + " and the remaining pen not distributed is " + remainingPen);
		
	
	}

}