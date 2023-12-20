import java.util.Scanner;
class Discount
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,d,topay;
		a=sc.nextInt();
		if(a<=2000)
		{
			d=a*5/100;
			topay=a-d;
			System.out.println(d);
			System.out.println(topay);
		}
		else if(a<=5000)
		{
			d=a*25/100;
			topay=a-d;
			System.out.println(d);
			System.out.println(topay);
		}
		else if(a<=10000)
		{
			d=a*35/100;
			topay=a-d;
			System.out.println(d);
			System.out.println(topay);
		}
		else
		{
			d=a*50/100;
			topay=a-d;
			System.out.println(d);
			System.out.println(topay);
		}
	}
}