// Write a java program that points the perimeter of the rectangle to take its length and breadth as input.


import java.util.Scanner;
public class Peri
{
	
public static void main(String args[])
{
	int a,b,p=0;
	Scanner Sc =new Scanner(System.in);
	
	System.out.println("Enter the length");
	a=Sc.nextInt();
	System.out.println("Enter the breadth");
	b=Sc.nextInt();
	
	p=(a+b)*2;
	System.out.println("The perimeter of the rectangle : "+p);
}
}