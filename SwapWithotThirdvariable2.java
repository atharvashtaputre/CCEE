import java.util.*;


public class SwapWithotThirdvariable2 {

	public static void main(String[] args) {
		System.out.println("Enter First Number ");
		Scanner sc = new Scanner(System.in);
		int n1= sc.nextInt();
		System.out.println("Enter Second Number ");
		int n2= sc.nextInt();
		
		n1=n1*n2;
		n2=n1/n2;
		n1=n1/n2;
		
		System.out.println("First Number "+n1);
		System.out.println("Second Number "+n2);
         
	}

}
