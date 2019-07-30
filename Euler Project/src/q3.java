class q3 { 
    public static long maxPrimeFactors(long n) 
    { 
          int i; 
	  long x=n; 
	  for (i=2;i<x;i++) 
           { 
	       while(x%i==0){
		  x/=i;  
	        } 
           } 
	  return i;
    } 
  
    public static void main(String[] args) 
    { 
		long n=600851475143; 
        long res=maxPrimeFactors(n); 
		System.out.println("Result :"+res);
    } 
} 
