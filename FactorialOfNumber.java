import java.util.*;

public class FactorialOfNumber {

	public static void main(String[] args) {
		System.out.println("Enter Number ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int fact=1;
		for(int i=1; i<=n;i++) {
			fact= fact*i;
			
			}
		System.out.println("Factorial of "+n+" is "+fact);

	}

}
