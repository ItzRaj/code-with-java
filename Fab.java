class Fab{
public static void main(String args[])
{
	int a=0,b=1,c=10,i,d;
	System.out.println(a+""+b);
	
	for(i=2;i<c;i++)
	{
		d=a+b;
		
		System.out.println(""+d);
		a=b;
		b=d;
	}
}
}