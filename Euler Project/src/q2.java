class q2 
{
	public static void main(String[] args) 
	{
		int ft=1,st=2,nt,n=4000000,sum=0;
		while(ft<n)
		{
			if(ft%2==0)    
				sum+=ft;
			nt=ft+st;
			ft=st;
			st=nt;
		}
		System.out.println("Result :"+sum);
	}
}
