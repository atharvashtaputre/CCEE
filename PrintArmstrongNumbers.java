import java.util.*;

public class PrintArmstrongNumbers {
      static void ArmstrongNum(int num) {
    	  int orignum=num;
  		int digits=0;
  		int sum=0;
  		while(orignum!=0)
  		{
           digits++;
           orignum=orignum/10;
  	    }
  		orignum=num;
  		while(orignum!=0)
  		{
  			int rem=orignum%10;
  			sum= (sum + (int)Math.pow(rem, digits));
  			orignum=orignum/10;
  			
  		}
  		
  		if(num==sum) {
  			System.out.println(num+" ");
  		}
  		

      }
	public static void main(String[] args) {
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Armstrong Numbers between 1 to "+num);
		for(int i=1;i<=num;i++)
		{
		ArmstrongNum(i);
		}
		
}
}
