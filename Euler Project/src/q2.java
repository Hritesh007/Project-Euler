import java.util.Scanner;
class q2 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int ft=1,st=2,nt,n,sum=0;
		System.out.println("Enter n:");
		n=s.nextInt();
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
