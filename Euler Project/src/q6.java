import java.util.Scanner;
class q6 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
        System.out.println("Enter n:");
		int n=s.nextInt();
		int s1=0,s2=0;
        for(int i=1;i<=n;i++)
		{
           s1+=Math.pow(i,2);
		   s2+=i;
		}
		int res=(int)Math.pow(s2,2)-s1;
		System.out.println("Result :"+res);
	}
}
