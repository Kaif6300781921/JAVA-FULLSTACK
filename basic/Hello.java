class Hello
{
	public static void  m1()
	{
		System.out.println("m1 starts");
		System.out.println("m1 ends");
	}
	public static void  m2()
	{
		System.out.println("m2 starts");
		System.out.println("m2 ends");
	}
	public static void main(String[]args)
	{
		System.out.println("main starts");
		Hello.m1();
		Hello.m2();
		
		System.out.println("mains ends");
	}
}
