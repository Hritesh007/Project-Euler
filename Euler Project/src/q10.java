import java.util.Scanner;
class q10 
{
	public static boolean isPrime(int n)
	{
		int i;
		for(i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n :");
		int n=s.nextInt();
		long sum=0;
		for(int i=2;i<=n;i++)
		{
			if(isPrime(i))
				sum+=i;
		}
		System.out.println("Result :"+sum);
	}
}