//4. Write a program in java that reads a forename, surname and year of birth and display the names and the year one after another sequentially.

import java.util.Scanner;
public class name
{																	
	public static void main(String args[])
	{
		
		int year_of_birth;
		Scanner Sc =new Scanner(System.in);
		
		System.out.println("Enter your forename");
		String forename=Sc.nextLine();
		System.out.println("Enter your surname");
		String surname=Sc.nextLine();
		System.out.println("Enter the birth year");
		year_of_birth=Sc.nextInt();
		
		System.out.println(" "+forename);
		System.out.println(" "+surname);
		System.out.println(" "+year_of_birth);
		
	}
}