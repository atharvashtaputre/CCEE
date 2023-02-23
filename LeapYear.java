import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter year ");
		Scanner sc = new Scanner(System.in);
		int y=sc.nextInt();
		if(((y%4==0)&&(y%100!=0))||(y%400==0)) {
			System.out.println("Year is leap  year ");
		}
		else
			System.out.println("Year is not leap  year ");

	}

}
