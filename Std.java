
import java.io.*;
class Std
	{
		public static void main(String args[])throws IOException
		{
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter your name");
			String name =br.readLine();
			System.out.println("Enter your age");
		    int age =Integer.parseInt(br.readLine());
	        
			System.out.println("name="+name+" "+" age="+age);
		}
		
	}	
	