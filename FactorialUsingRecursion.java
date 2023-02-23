import java.util.*;

public class FactorialUsingRecursion {
   public static long factorial(int n) {
	   if(n==0|| n==1)
		   return 1;
	   else
		   return n*factorial(n-1);
   }
	
	public static void main(String[] args) {
		System.out.println("Enter Number ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		System.out.println("Factorial is "+factorial(n));
		

	}

}
