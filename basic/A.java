class A
{
	public static void  m1()
	{
		System.out.println("m1 starts");
		System.out.println("m1 ends");
	}
	public static void main(String[]args)
	{
		System.out.println("main starts");
		A.m1();
		A.m1();
		System.out.println("mains ends");
	}
}
