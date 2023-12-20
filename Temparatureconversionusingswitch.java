import java.util.Scanner;
class Temparatureconversionusingswitch
{
	public static void main(String args[])
		{
			Scanner sc=new  Scanner(System.in);
			float ft=0,ct=0,kt=0,it;
			char choice; 
			System.out.println("F : fahrenheit ");
			System.out.println("C : celsius ");
			System.out.println("K : kelvin ");

			System.out.println("Enter the initial temparature :");
			it = sc.nextFloat();
			System.out.println("Enter the choice ");
			choice=sc.next().charAt(0);

			switch(choice)
			{
				case 'F' : it=ft;
						ct=(5/9.0f*(ft-32.0f));
						kt= ct+273.03f;
						break;
				case 'C' : it = ct;
						ft = (9.0f*ct)/5+32.0f;
						kt=ct+273.03f;
						break;
				case 'K' : it=kt;
						ct = kt-273.03f;
						ft =  (9.0f*ct)/5+32.0f;
						break;
				default :  System.out.println("Invalid choice");
			}
			System.out.println(" Fahrenheit=" +ft);
			System.out.println(" Celsius = " +ct);
			System.out.println("Kelvin = "+kt);
		}
}