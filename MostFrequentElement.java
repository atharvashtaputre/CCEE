import java.util.*;

public class MostFrequentElement {

	public static void main(String[] args) {
		int []arr= {12,12,40,30,50,12,12,14,14,14};
		int frequentele=0;
		int maxcount=0;
		for(int i=0;i<arr.length;i++)
		{
			 int count=0;
			 for(int j=0;j<arr.length;j++) 
			 {
				if(arr[i]==arr[j]) {
					count++;
				}
				
		}
			 if(count>maxcount) {
				 maxcount=count;
				 frequentele=arr[i];
			 }
			 
			 
			 
		}
		System.out.println(frequentele);
		
    
	}

}
