// Write a java program that takes hours and minutes as input and calculates the total number of minutes.

import java.util.Scanner;
public class hour
{
	public static void main(String args[])
	{
		float hr,min,total;
			Scanner Sc =new Scanner(System.in);
			
			System.out.println("Enter the time in hour");
			hr=Sc.nextFloat();
			System.out.println("Enter the time in minutes");
			min=Sc.nextFloat();
			
			total=(hr*60)+min;
			
			System.out.println(" The total time in minutes : "+total);
	}
}
			