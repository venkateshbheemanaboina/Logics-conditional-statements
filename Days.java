import java.util.Scanner;
class Days
{
	int days,month_code,year,year_code,leap_year,temp1,temp2,total,result;
	int month;
	Scanner s = new Scanner(System.in);
	void get()
	{
		System.out.println("enter the day of a month");
		days = s.nextInt();
		System.out.println("enter the month in numbers only");
		month = s.nextInt();
		System.out.println("enter the year");
		year = s.nextInt();
	}
	void monthProcess()
	{
		if(month==7)
		{
			month_code=0;
		}
		else if (month==1||month==10)
		{
			month_code = 1;
		}
		else if (month==5)
		{
			month_code =2;
		}
		else if (month==8)
		{
			month_code = 3;
		}
		else if (month==2||month==3||month==11)
		{
			month_code = 4;
		}
		else if (month==6)
		{
			month_code = 5;
		}
		else if (month==9||month==12)
		{
			month_code = 6;
		}
		else 
		{
			System.out.println("enter the month properly");
		}
		
	}
	void yearProcess()
	{
		if (year>=1900&&year<=1999)
		{
			year_code=0;
		}
		else if (year>=2000&&year<=2099)
		{
			year_code=6;
		}
		else if (year>=2100&&year<=2199)
		{
			year_code=4;
		}
		else if (year>=2200&&year<=2299)
		{
			year_code=2;
		}
		else if (year>=2300&&year<=2399)
		{
			year_code=0;
		}
		else 
		{
			System.out.println("enter the year between 1900 to 2399");
		}
	}
	void conclusion()
	{  
		if(year%4!=0)
		{
		temp1 = year%100;
	    leap_year= temp1/4;
		total = days+month_code+year_code+temp1+leap_year;
		result = total%7;
		switch (result)
		{
		case  0: System.out.println("saturday");
		           break;
		case  1: System.out.println("sunday");
		          break;
		case  2: System.out.println("monday");
		           break;
		case  3: System.out.println("tuesday");
		           break;
		case  4: System.out.println("wednesday");
		           break;
		case  5: System.out.println("thusday");
		            break;
		case  6: System.out.println("friday");
		             break;
		default : System.out.println("error");
		
		}
		}
		
	}
	void conclusion2()
	{
		if(year%4==0&&(month==1||month==2))
		{
		temp1 = year%100;
	    leap_year= temp1/4;
		total = days+month_code+year_code+temp1+leap_year;
		result = total%7;
		switch (result)
		{
		case  0: System.out.println("friday");
		           break;
		case  1: System.out.println("saturday");
		          break;
		case  2: System.out.println("sunday");
		           break;
		case  3: System.out.println("monday");
		           break;
		case  4: System.out.println("tuesday");
		           break;
		case  5: System.out.println("wedsnesday");
		            break;
		case  6: System.out.println("thursday");
		             break;
		default : System.out.println("error");
		
		}
		}
		else{
			if(year%4==0)
		{
		temp1 = year%100;
	    leap_year= temp1/4;
		total = days+month_code+year_code+temp1+leap_year;
		result = total%7;
		switch (result)
		{
		case  0: System.out.println("saturday");
		           break;
		case  1: System.out.println("sunday");
		          break;
		case  2: System.out.println("monday");
		           break;
		case  3: System.out.println("tuesday");
		           break;
		case  4: System.out.println("wednesday");
		           break;
		case  5: System.out.println("thusday");
		            break;
		case  6: System.out.println("friday");
		             break;
		default : System.out.println("error");
		
		}
		}
		
		}
		
	}
	
	public static void main(String args[])
	{
		Days d1= new Days();
		d1.get();
		d1.monthProcess();
		d1.yearProcess();
		d1.conclusion();
		d1.conclusion2();
		
	}
}	