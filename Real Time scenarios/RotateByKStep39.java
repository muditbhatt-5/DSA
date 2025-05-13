import java.util.Arrays;

public class RotateByKStep39 {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        System.out.println("n:"+n);
        k = k % n; // Handle k greater than n
        System.out.println("k"+k);

        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the remaining n-k elements
        reverse(nums, k, n - 1);
    }

    // Helper method to reverse part of the array
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            // Swap elements
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // Test the function
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        
        rotate(nums, k);
        System.out.println("Rotated array: " + Arrays.toString(nums));
    }
}
