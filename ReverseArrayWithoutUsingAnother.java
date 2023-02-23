import java.util.*;

public class ReverseArrayWithoutUsingAnother {

	 static int[] reverse(int[]arr)
	 {
		 if(arr==null || arr.length<=1)
		 {
			 System.out.println("Invalid array");
		 }
		 for(int i=0;i<arr.length/2;i++) {
			 int temp=arr[i];
			 arr[i]=arr[arr.length-1-i];
			 arr[arr.length-1-i]=temp;
		 }
		 return arr;
	 }
	public static void main(String[] args) {
		System.out.println("Enter number of elements ");
	      Scanner sc =new Scanner(System.in);
	      int n=sc.nextInt();
	      int []arr=new int[n];
	      System.out.println("Enter array elements ");
	      for(int i=0;i<arr.length;i++) {
	    	  arr[i]=sc.nextInt();
	      }
	      System.out.println("Original Array"+Arrays.toString(arr));
	      System.out.println("Reverse Array"+Arrays.toString(reverse(arr))) ;
	}

}
