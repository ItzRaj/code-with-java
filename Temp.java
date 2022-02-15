import java.util.Scanner;
public class Temp
{
	public static void main(String args[])
		{
			float c;
			Scanner Sc =new Scanner(System.in);
			System.out.println("Enter the temperature");
			c=Sc.nextFloat();
			c=((c*9)/5)+32;
			
			System.out.println("The temperature in fahrenheit"+c);
		}
}