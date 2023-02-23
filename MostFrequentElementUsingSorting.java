import java.util.*;

public class MostFrequentElementUsingSorting {

	public static void main(String[] args) {
		int []arr= {12,12,40,30,50,12,12,14,14};
		int frequentele=0;
		int maxcount=0;
		int count=0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++)
		{
			
			 if(arr[i]==arr[i+1])
			 {
				 count++;
			 }
			 else
			 {
				 if(count>maxcount) {
					 maxcount=count;
					 frequentele=arr[i];
					 count=0;
				 }
			 }
				 
			
				
		}
		System.out.println(frequentele);
			 
			 
			 
			 
		}
	
		
    
	}


