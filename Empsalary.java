import java.util.Scanner;
class Empsalary
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int yos; String q,choice,a;
		System.out.println("Enter male for MALE");
		System.out.println("Enter female for FEMALE");
		System.out.println("Chose the choice");
		choice=sc.next();
		System.out.println("Enter the year of exp");
		yos=sc.nextInt();
		System.out.println("Enetr graduation");
		q=sc.next();
		switch(choice)
		{
			case "male" : if(yos>=10)
						{
							if(q.equals("postgraduate"))
							{
								System.out.println("He get ="+15000);
							}
							else
								System.out.println("He get ="+10000);
						}
						else 
						{
							if(q.equals("postgraduate"))
							{
								System.out.println("He get ="+10000);
							}
							else
								System.out.println("He get ="+7000);
						}
						break;
			case "female" : if(yos>=10)
						   {
							if(q.equals("postgraduate"))
							{
								System.out.println("She get ="+12000);
							}
							else
								System.out.println("She get ="+9000);
						  }
						  else 
						  {
							if(q.equals("postgraduate"))
							{
								System.out.println("She get ="+10000);
							}
							else
								System.out.println("She get ="+6000);
						  }
						     break;
			default : System.out.println("invalid choice");
		}
	}
}
							
		