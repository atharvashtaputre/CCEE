import java.util.*;

public class RotateArrayElementsNTimes {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0 ; i<n ; i++)
		{
			int temp = arr[0];
			for(int j=0 ; j<arr.length-1 ; j++)
			{
				arr[j]=arr[j+1];
			}
			arr[arr.length-1] = temp;
		}
	
		for(int ele:arr)
		{
			System.out.print(ele+" ");
		}
	}

}
