import java.util.*;

public class RotateArrayElementsNTimesRightShift {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60};
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0 ; i<n ; i++)
		{
			int temp = arr[arr.length-1];
			for(int j=arr.length-2 ; j>=0 ; j--)
			{
				arr[j+1]=arr[j];
			}
			arr[0] = temp;
		}
	
		for(int ele:arr)
		{
			System.out.print(ele+" ");
		}
	}

}
