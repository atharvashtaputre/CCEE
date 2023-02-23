import java.util.*;

public class SmallestNumber {

	public static void main(String[] args) {
		System.out.println("Enter 3 numbers ");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int i=0;
		while(true) {
			if(i==a|| i==b || i==c)
			{
				break;
			}
			i++;
		}
		System.out.println("Smallest number is "+i);
		

	}

}
