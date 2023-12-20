import java.util.*;
class Givenrangeornotusingifelse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int a,b,c,sum;
		System.out.println("enter any  number");
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		sum= a+b+c;
		if (sum>=100 && sum<=200)
		{
			System.out.println("it is in range");
		}
		else
		{
			System.out.println(" it is not in a range");
		}
	}
}