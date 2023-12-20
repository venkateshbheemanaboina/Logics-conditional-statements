import java.util.*;
class Givenrangeornotusingifelse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int a,b,c;
		System.out.println("enter any three  numbers");
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		
		if (a>b)
		{
			if (a>c)
				{
					System.out.println("a is big");
				}
			else
				{
					System.out.println("c is big");
				}
		}
		else 
			{
				if (b>c)
					{
						System.out.println("b is big");
					}
				else
					{
						System.out.println("c is big");
					}
			
		}
	}
}