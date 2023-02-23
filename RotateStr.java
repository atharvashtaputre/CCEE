import java.util.*;
class RotateStr {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		String s1 = sc.nextLine();
		boolean flag = true;
		for(int j=0;j<s.length(); j++)
		{
			char ch=s.charAt(0);
			s = s.substring(1)+ch;
			if(s.equals(s1))
			{
				System.out.println("Strings are matching");
				flag = false;
				break;
			}	
		}
		if (flag)
			System.out.println("Strings are Not matching");

		
		
	}
}