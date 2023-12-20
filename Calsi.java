class Samplemethodcalling
{
 	static int x,squre,qube;
 	static void setInput()
	{
		x=7;
	}
	static void calSqure()
	{
		squre=x*x;
	}
	static void calQube()
	{
		qube = squre*x;
	}
	public static void main(String[] args)
	{
		Samplemethodcalling.setInput();
		Samplemethodcalling.calSqure();
		Samplemethodcalling.calQube();
		System.out.println(squre);
		System.out.println(qube);
	}
}