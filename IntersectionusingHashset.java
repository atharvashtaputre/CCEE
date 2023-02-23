import java.util.*;

public class IntersectionusingHashset {

	public static void main(String[] args) {
		Integer[]a1= {0,1,2,3,4,5};
		Integer[]a2= {3,4,5,1};
		
		HashSet<Integer> s=new HashSet<>();
		s.addAll(Arrays.asList(a1));
		s.retainAll(Arrays.asList(a2));
		
		System.out.println(s);
		
		
		
	}

}
