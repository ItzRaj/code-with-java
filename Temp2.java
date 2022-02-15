import java.util.Scanner;
public class Temp2
{
	public static void main(String args[])
		{
			float f;
			Scanner Sc =new Scanner(System.in);
			System.out.println("Enter the temperature");
			f=Sc.nextFloat();
			f=((f-32)*5)/9;
			
			System.out.println("The temperature in celsius"+f);
		}
}