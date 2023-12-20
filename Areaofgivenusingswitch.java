import java.util.Scanner;
class Areaofgivenusingswitch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float a,r,bredth,base,h,l,area; char choice;
		System.out.println("C : Circle");
		System.out.println("S : Squre");
		System.out.println("R : Rectangle");
		System.out.println("T  : Triangle");
		
		System.out.println("Enter the choice");
		choice = sc.next().charAt(0);
		
		switch(choice)
		{
			case 'C' : System.out.println("Enter the radious");
					r=sc. nextFloat();
					area = (3.142f*r*r);
					System.out.println("Area of circle is:"+area);
					break;
			case 'S' : System.out.println("Enter the side");
					a=sc.nextFloat();
					area = a*a;
					System.out.println("Area of the squre : "+area);
					break;
			case 'R' : System.out.println("Enter the bredth and length");
					bredth=sc.nextFloat();
					l=sc.nextFloat();
					area = bredth*l;
					System.out.println("Area of the Rectangle :"+area);
					break;
			case 'T' : System.out.println("Enter the base and height");

					base=sc.nextFloat();
					h=sc.nextFloat();
					area = 1/2.0f*base*h;
					System.out.println("Area of the Triangle : "+area);
					break;
			default : System.out.println("Entered wrong choice");
		}
	}
}
					
		
		
