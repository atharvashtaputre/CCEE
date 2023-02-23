import java.util.*;

public class IntersectionOfTwoArray {

	public static void main(String[] args) {
		int arr1[]= {23,36,56,78,55};
		int arr2[]= {78,39,59,71,55};
		System.out.println("Intersection of two arrays :");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j]) {
					System.out.println(arr2[j]);
				}
			}
			
		}
	}

}
