import java.util.*;
class Ovelornotusingswitch
{
	public static void main(String args[])
		{
			Scanner sc=new  Scanner(System.in);
			char choice;
			System.out.println("Enter the alphabet");
			choice = sc.next().charAt(0);
			switch(choice)
			{
				case 'a' :
				case 'e' :
				case 'i' :
				case 'o' :
				case 'u' :
				case 'A' :
				case 'E' :
				case 'I' :
				case 'O' :
				case 'U' :   System.out.println("given alphabet is a OVEL");
							break;
				default :  System.out.println("given alphabet is a CONSONENT");
			}
		}
}