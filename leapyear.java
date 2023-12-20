class A
{
  public static void main(String[] args) 
  {
     int a=3450;
     if(a%4==0)
    {
      	if((a%400==0)||(a%100!=0))
 	     {
        	 System.out.println("leap year");
   	  } 
 	   else
		{ 
		  System.out.println("not a leap year");
		}
	}
	else
	{
  		 System.out.println("not a leap year");
	}
	}
 }
