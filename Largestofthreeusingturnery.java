import java.util.*;
class Largestofthreeusingturnery
{
	public static void main(String [] args)
	{
		int a=4,b=5,c=6,largest;
		largest =((a>b&&a>c))?a:((b>c)?b:c);
		System.out.println("the largest amoung of three is "+largest);
	}
}