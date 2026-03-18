import java.util.Scanner;
class  J
{
	public static void main(String[] args) 
	{
		System.out.println("ENTER NUMBER");
		Scanner Scn=new Scanner(System.in);
		int n=Scn.nextInt();
		int sum=0;
		while(n>0){
			sum +=n%10;
			n/=10;
			if(n==0 && sum>9){
				System.out.println(sum);
				n=sum;
				sum=0;
				
	}
}

System.out.println(sum);
	}
}