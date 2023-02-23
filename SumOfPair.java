import java.util.*;

public class SumOfPair {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60};
		System.out.println("Enter sum");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0 ; i<arr.length-1 ; i++)
		{
			for(int j=i+1 ; j<arr.length ; j++)
			{
				if(arr[i]+arr[j]==n)
				{
					System.out.print(arr[i]+" "+arr[j]);
					System.out.println();
				}
			}
			
		}
	
		
	}

}
