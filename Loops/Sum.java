import java.util.Scanner;
class  Sum
{
	public static void main(String[] args) 
	{
		Scanner Scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=Scn.nextInt();
		int sum=0;
		for(int i=1; i<=n; i++){
			sum +=i;
		}
			
			System.out.println(sum);
				
	}
}
