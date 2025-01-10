class EarthRadius{

public static void main(String [] args)
{
    int radius=6378;
	double volumeKM=(4.0/3.0)*Math.PI*Math.pow(radius,3);
	double volumeMiles= volumeKM*Math.pow(0.621,3);
	System.out.println("The volume of earth in cubic kilometers is "+volumeKM+" and cubic miles is "+volumeMiles);
}

}