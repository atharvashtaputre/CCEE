import java.util.*;

public class UnionOfTwoUnsortedArray {
      static void union(int a[],int n ,int b[],int m)
      {
    	  Set<Integer> s=new HashSet<Integer>();
    	  for(int i=0;i<n;i++) {
    		  s.add(a[i]);
    	  }
    	  for(int i=0;i<m;i++) {
    		  s.add(b[i]);
    	  }
    	  System.out.println("Union of array "+s);
      }
	public static void main(String[] args) {
		int arr1[]= {23,36,59,65,55,20};
		int arr2[]= {78,39,59,71,55};
		int len1=arr1.length;
		int len2=arr2.length;
		union(arr1,len1,arr2,len2);

	}

}
