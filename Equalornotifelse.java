import java.util.*;
class positiveornegativeifelse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int a;
		System.out.println("enter any  number");
		a= sc.nextInt();
		if (a>=0)
		{
			System.out.println(a+"    is positive number");
		}
		else
		{
			System.out.println(a+ " is a negative number");
		}
	}
}