import java.util.Scanner;
class Ternary
{
	public static void main(String [] args)
	{
		int a=30,b=20,c=20; char d;
		d= ((a>b && a>c) ? 'a' :(b>c)? 'b' :'c');
			System.out.println(d);
	}
}