import java.util.*;

public class CheckPerfectNumber {
	static boolean isPerfect(int n) {
		if(n==1)
			return false;
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
			return true;
		
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		if(isPerfect(num))
		{
			System.out.println(num+" is perfect number");
		}
		else
		{
			System.out.println(num+" is not perfect number");
		}
	}

}
