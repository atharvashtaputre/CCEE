import java.util.*;

public class GcdofNumber2 {

	public static void main(String[] args) {
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		int gcd =1;
		for(int i=1;i<=x && i<=y;i++)
		{
			if(x%i==0 && y%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("GCD is "+gcd);
		
		
}
}