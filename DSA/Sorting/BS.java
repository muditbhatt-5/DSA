import java.util.*;

public class BS {
    public static void bs(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int key = 6;
        boolean found = false;

        while (left <= right) {
            int middle = (left + right) / 2;
            System.out.println("Checking middle index: " + middle);

            if (key == arr[middle]) {
                System.out.println("Key found at index: " + middle);
                found = true;
                break;
            } else if (key < arr[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        if (!found) {
            System.out.println("Key not found");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        bs(arr);
    }
}
