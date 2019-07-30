import java.util.Scanner;
class q7 
{
	public static boolean isPrime(int n) 
    {
		if(n==2)
			return true;
		if(n%2==0 && n!=2) 
		    return false; 
		for(int i=3;i<=Math.sqrt(n);i+=2) 
		{ 
                  if(n%i==0) 
                   return false;
                }
	        return true;
    }
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=s.nextInt();
		int x=1,count=0;
		while(count<n)
		{
			x++;
			if(isPrime(x))
			{
				count++;
			}
		}
		System.out.println("Result :"+x);
	}
}
