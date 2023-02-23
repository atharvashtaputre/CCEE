import java.util.*;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		System.out.println("Enter number up to which you want to print prime no ");
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		
		
		for( int num=1;num<=num1;num++) 
		{
			int count=0;
			for(int i=1;i<=num;i++)
			{
			    if(num%i==0)
				count++;
			}
			
		
		
		if(count==2)
		{
			System.out.println(num+" ");
		}
		
		}
		

	}

}
