import java.util.Scanner;
class H
{
	public static void main(String[] args) 
	{
		System.out.println("enter number");
		Scanner Scn=new Scanner(System.in);
		int n=Scn.nextInt();
		int sum=0;
		while(n>0){
			int d=n%10;
			sum+=d;
			n/=10;
	}
	System.out.println(sum);
	}
}
