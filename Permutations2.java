import java.util.*;

public class Permutations2 {
	static int count = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.println("Permutations of " + str + ":");
        permuteFun(str.toCharArray(), 0, str.length() - 1);
		
    }

    public static void permuteFun(char[] arr, int start, int end) {
        
		
		if (start == end) {
            System.out.println(String.valueOf(arr));
        } else {
            for (int i = start; i <= end; i++) {
				
                swap(arr, start, i);
                permuteFun(arr, start + 1, end);
                swap(arr, start, i);
            }
        }
		
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}