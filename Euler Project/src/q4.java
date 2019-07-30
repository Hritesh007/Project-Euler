class q4 
{
	public static boolean chkPalindrome(int n)
	{
		int a=n,r=0;
		while(a!=0)
		{
			r=(r*10)+(a%10);
			a/=10;
		}
		if(n==r)
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{
		int max=0,a=999;
		while(a>=100)
		{
			int b=999;
			while(b>=a)
			{
				if(a*b<max)
					break;
				if(chkPalindrome(a*b))
					max=a*b;
				b--;
			}
			a--;
		}
		System.out.println("Result :"+max);
	}
}
