class q6 
{
	public static void main(String[] args) 
	{
	int n=100;
	int sum=(n*(n+1))/2;
	int sum_sq=((2*n+1)*(n+1)*n)/6;
    System.out.println("Result :"+((int)Math.pow(sum,2)-sum_sq));
	}
}
