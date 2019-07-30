import java.util.Scanner;
class q3 { 
    public static long maxPrimeFactors(long n) 
    { 
		long max=0;
        while (n % 2 == 0) { 
            max=2; 
            n /= 2; 
        } 
    for (long i = 3; i <= Math.sqrt(n); i += 2) { 
            while (n % i == 0) { 
                max=i; 
                n /= i; 
            } 
        } 
  if (n > 2) 
            max=n; 
		return max;
    } 
  
    public static void main(String[] args) 
    { 
		Scanner s=new Scanner(System.in);
        System.out.println("Enter n:");
		long n=s.nextLong(); 
        long res=maxPrimeFactors(n); 
		System.out.println("Result :"+res);
    } 
} 