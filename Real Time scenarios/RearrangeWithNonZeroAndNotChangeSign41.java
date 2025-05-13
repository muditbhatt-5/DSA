import java.util.Arrays;

public class RearrangeWithNonZeroAndNotChangeSign41 {
    public static long smallestNumber(int num) {
        // Step 1: Convert num to char array (digits only)
        char[] digits = String.valueOf(Math.abs(num)).toCharArray();
        
        // Step 2: Sort the digits
        Arrays.sort(digits);
        
        // Step 3: Handle positive number
        if (num >= 0) {
            // If first digit is 0, find the first non-zero and swap
            // 013
            if (digits[0] == '0') {
                for (int i = 1; i < digits.length; i++) {
                    if (digits[i] != '0') {
                        char temp = digits[0];
                        digits[0] = digits[i];
                        digits[i] = temp;
                        break;
                    }
                }
            }
            return Long.parseLong(new String(digits));
        }

        // Step 4: Handle negative number → sort in reverse for max number
        Arrays.sort(digits);
        StringBuilder sb = new StringBuilder(new String(digits));
        sb.reverse(); // largest number for negative input
        return -Long.parseLong(sb.toString());
    }

    public static void main(String[] args) {
        int num = 310;
        System.out.println("Minimum rearranged number: " + smallestNumber(num)); // Output: 103
    }
}
