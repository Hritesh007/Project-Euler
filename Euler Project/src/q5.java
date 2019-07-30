class q5 
{
         public static long findGCD(long a,long b)         
         {
            if(b == 0){
            return a;
        }
        return findGCD(b, a%b); 
         }
	public static void main(String[] args) 
	{
	 long lcm=1;
                    for(long i=11;i<=20;i++)
                    {
                      lcm=(lcm*i) / findGCD(lcm,i);
                    }    
                   System.out.println("Result :"+lcm);
	}
}
