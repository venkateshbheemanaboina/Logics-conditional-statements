import java.util.Scanner;
class Year1
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int year,a,b,c,d,e,f,g,h;
		System.out.println("Enter the year");
		year=sc.nextInt();
		if((year>=1904)&&(year<=2000))
		{
			a=year-1904;
			g=((year-1)-1900)/4;
			b=(a)*365;
			c=b%7;
			f=(c+g)%7;
			d=f;
			
			if(d==0)
				System.out.println("friday");
			else if(d==1)
				System.out.println("Saturday");
			else if(d==2)
				System.out.println("sonday");
			else if(d==3)
				System.out.println("Monday");
			else if(d==4)
				System.out.println("thusday");
			else if(d==5)
				System.out.println("wednesday");
			else 
				System.out.println("thursday");	
		}
		else
		{
			a=year%400;
			if(a>0 && a<=100)
			{	
				b=a%7;
				c=(a-1)/4;
				d=(b+c)%7;
				if(d==1)
				System.out.println("Monday");
				else if(d==2)
				System.out.println("Tusday");
				else if(d==3)
				System.out.println("Wednusday");
				else if(d==4)
				System.out.println("Thursday");
				else if(d==5)
				System.out.println("Friday");
				else if(d==6)
				System.out.println("Saturday");
				else 
				System.out.println("thursday");
			}
			else if(a>100 && a<=200)
			{	
				b=(a-100)%7;
				c=(a-101)/4;
				d=(b+c)%7;
				if(d==3)
				System.out.println("Monday");
				else if(d==4)
				System.out.println("Tusday");
				else if(d==5)
				System.out.println("Wednusday");
				else if(d==6)
				System.out.println("Thursday");
				else if(d==0)
				System.out.println("Friday");
				else if(d==1)
				System.out.println("Saturday");
				else 
				System.out.println("sunday");
			}
			else if(a>200 && a<=300)
			{	
				b=(a-200)%7;
				c=(a-201)/4;
				d=(b+c)%7;
				if(d==5)
				System.out.println("Monday");
				else if(d==6)
				System.out.println("Tusday");
				else if(d==0)
				System.out.println("Wednusday");
				else if(d==1)
				System.out.println("Thursday");
				else if(d==2)
				System.out.println("Friday");
				else if(d==3)
				System.out.println("Saturday");
				else 
				System.out.println("Sunday");
			}
			else if(a>300 && a<=400)
			{	
				b=(a-300)%7;
				c=(a-301)/4;
				d=(b+c)%7;
				if(d==0)
				System.out.println("Monday");
				else if(d==1)
				System.out.println("Tusday");
				else if(d==2)
				System.out.println("Wednusday");
				else if(d==3)
				System.out.println("Thursday");
				else if(d==4)
				System.out.println("Friday");
				else if(d==5)
				System.out.println("Saturday");
				else 
				System.out.println("Sunday");
				
			}
			else 
				System.out.println("Saturday");
				
		}
	}
}
			
				
					
			
			