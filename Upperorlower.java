import java.util.*;
class Upperorlower
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		int ab;
		System.out.println("enter any one alphabet");
		ch=sc.next().charAt(0);
		ab=ch;
		if (ab>=65 && ab<=90)
			System.out.println("Given alphabet is a Uppercase");
		else if (ab>=97 && ab<=122)
			System.out.println("Given alphabet is a Lowercase");
		else
			System.out.println("Not a alphabet");
		System.out.println("ASCII value of given char is ="+ab);
	}
}