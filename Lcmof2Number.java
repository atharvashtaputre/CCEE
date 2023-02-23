import java.util.*;

public class Lcmof2Number {

	public static void main(String[] args) {
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		int gcd =1;
		int Lcm=0;
		for(int i=1;i<=x && i<=y;i++)
		{
			if(x%i==0 && y%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("GCD is "+gcd);
		
		Lcm=x*y/gcd;
		System.out.println("LCM of"+x+" and "+y+" is "+Lcm);
		
}
}