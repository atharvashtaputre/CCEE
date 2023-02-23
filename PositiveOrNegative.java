import java.util.*;

public class PositiveOrNegative {

	public static void main(String[] args) {
		System.out.println("Enter Number ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		if(n>=0) {
			System.out.println(n+" Number is Positive");
		}
		else
		{
			System.out.println(n+" Number is Negative");
		}
		

	}

}
