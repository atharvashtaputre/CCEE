import java.util.*;

public class SumOfTwoNowithoutPlusOperator {

	public static void main(String[] args) {
		System.out.println("Enter 2 numbers ");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		for(int i=1;i<=b;i++)
		{
			a++;
		}

		System.out.println("Sum is "+a);
	}

}
