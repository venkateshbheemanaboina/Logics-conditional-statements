import java.util.*;
class Avgofsixsubusingifelseif
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		int a,b,c,d,e,f,avg;
		
		System.out.println("enetr the Student marks");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		f=sc.nextInt();
		avg=(a+b+c+d+e+f)/6;
		
		if (a<35 || b<35 || c<35 || d<35 || e<35 || f<35)
			System.out.println("fail");
		else if (avg>=35 && avg<50)
			System.out.println("third");
		else if(avg>=50 && avg<60)
			System.out.println("second");
		else if (avg>=60 && avg<70)
		 	System.out.println("first");
		else 
			System.out.println("distinction");
	}
}
