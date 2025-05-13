public class NonDecreasing40 {
    public static boolean CheckA(int[] nums) {
        int count = 0; // To track how many changes we make

        for (int i = 0; i < nums.length - 1; i++) {
            // 4 > 3
            if (nums[i] > nums[i + 1]) {
                count++;

                if (count > 1) {
                    return false; // More than one modification needed
                }

                // Try modifying nums[i] or nums[i+1]
                if (i == 0 || nums[i - 1] <= nums[i + 1]) {
                    nums[i] = nums[i + 1]; // Modify nums[i] to match nums[i+1]
                } else {
                    nums[i + 1] = nums[i]; // Modify nums[i+1] to match nums[i]
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] Arr = {4,3,2,4};
        boolean CheckingVariable = CheckA(Arr);
        for(int i=0;i<=Arr.length-1;i++)
        {
            System.out.println(Arr[i]);
        }
        
        if (CheckingVariable) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
