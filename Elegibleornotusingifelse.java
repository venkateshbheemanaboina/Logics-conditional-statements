import java.util.*;
class Elegibleornotusingifelse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int age;
		System.out.println("enter the age");
		age= sc.nextInt();
		if (age>=18)
		{
			System.out.println("person  is elegible for voteing");
		}
		else
		{
			System.out.println("person is not elegible for voteing");
		}
	}
}