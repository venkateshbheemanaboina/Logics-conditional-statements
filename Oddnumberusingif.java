import java.util.*;
class Oddnumberusingif
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		float a,b;
		System.out.println("enter a number ");
		/* a= sc.nextInt();
		if (a%2!=0)
			System.out.println(a+ "  if a Odd number");*/
		a=sc.nextFloat();
		b=sc.nextFloat();
		if ((a/b)>0)
		{
			a=a+b;
			b=a-b;
			a=a-b;
			// System.out.println("value of a is ="+a+"   " + "value of b is ="+b);
		}
		System.out.println("value of a is ="+a+"   " + "value of b is ="+b);
	}
} 