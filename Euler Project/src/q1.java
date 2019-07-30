class q1 
{
	public static void main(String[] args) 
	{
		int n=1000,sum=0,i;
		System.out.println("Enter n:");
        n=s.nextInt();
		for(i=1;i<n;i++)
		{
			if(i%3==0 ||i%5==0)
				sum+=i;
		}
		System.out.println("Result :"+sum);
	}
}
