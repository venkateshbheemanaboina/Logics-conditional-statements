import java.util.Scanner;
class Calculatorusingswitch
{
	public static void main(String args[])
		{
			Scanner sc=new  Scanner(System.in);
			int a,b,result;
			char choice;
			System.out.println("+ : Addition");
			System.out.println("- : Subtraction");
			System.out.println("* : Multiplication");
			System.out.println("/ : Division");
	
			System.out.println("Enter a and b values");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Enter the choice");
			choice = sc.next().charAt(0);
			
			switch(choice)
			{
				case  '+'  : result=a+b;
						System.out.println("Addition="+ result);
						break;
				case  '-'  : result=a-b;
						System.out.println("Sutraction="+ result);
						break;
				case  '*' : result=a*b;
						System.out.println("Myltiplication="+ result);
						break;
				case  '/'  : result=a/b;
						System.out.println("Divition="+ result);
						break;
				default :  System.out.println("invalid choice");
			}
		}
}