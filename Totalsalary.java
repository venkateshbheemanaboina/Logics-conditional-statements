import java.util.*;
class Totalsalary
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		int bs,con;
		float da,hra,ts;
		System.out.println("enetr the basic salary");
		bs=sc.nextInt();
		 
		if(bs>=5000)
		{
		da=(110*bs)/100;
		hra=(20*bs)/100;
		con=500;
		}
		else if(bs>3000 && bs<5000)
		{
		da=(100*bs)/100;
		hra=(15*bs)/100;
		con=300;
		}
		else 
		{
		da=(90*bs)/100;
		hra=(10*bs)/100;
		con=150;
		}
	ts=bs+da+hra+con;
	System.out.println("the total salary is= "+ts);
	}
}