import java.util.Scanner;

public class EvenOddPrgm {

	public static void main(String[] args) {
		System.out.println("Enter Number 6");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		if(n%2==0) {
			System.out.println(n+" Number is Even");
		}
		else
		{
			System.out.println(n+" Number is odd");
		}
		

	}

}
