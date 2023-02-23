import java.util.*;

public class FindMissingNumber {
    
    public static int findMissingNumber(int[] nums) {
        // Sort the array in ascending order
        Arrays.sort(nums);
        
        // Check if 1 is missing
        if (nums[0] != 1) {
            return 1;
        }
        
        // Check if N is missing
        int n = nums.length + 1;
        if (nums[nums.length - 1] != n) {
            return n;
        }
        
        // Check if any number in between is missing
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] > 1) {
                return nums[i - 1] + 1;
            }
        }
        
        // No number is missing
        return -1;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6, 7, 8, 9, 10};
        int missingNumber = findMissingNumber(nums);
        System.out.println("The missing number is " + missingNumber);
    }
}
