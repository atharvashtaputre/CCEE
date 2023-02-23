import java.util.*;

public class MostFrequentElementUsingMap {

	public static void main(String[] args) {
		int []arr= new int[] {10,30,20,15,12,12,10,12};
		
		Map<Integer,Integer> mp=new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(mp.containsKey(arr[i])) {
				mp.put(arr[i],mp.get(arr[i])+1);
			}
			else {
				mp.put(arr[i],1);
			}
		}
		int maxcount=0;
		int frequentele=0;
		for(Map.Entry<Integer,Integer> entry:mp.entrySet()) {
			//System.out.println(entry.getValue());
			if(maxcount < entry.getValue()) {
				maxcount=entry.getValue();
				frequentele=entry.getKey();
			}
		}
		
		System.out.println(frequentele);
		
		

	}

}
