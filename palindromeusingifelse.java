import java.util.*;
class palindromeusingifelse
{
	public static void main(String args[])
	{
		Scanner  sc=new  Scanner(System.in);
		int a,b,c,d;
		System.out.println("Enter four digit number");
		a=sc.nextInt();
		b=a/10 ;
		c=b%100;
		
		
		if ((a%10==a/1000)&&(c%10==c/10))
		{
			System.out.println("Given number is palindrome");
		}
		else
		{
			System.out.println("given number is not a palindroem");
		}
	}	
}