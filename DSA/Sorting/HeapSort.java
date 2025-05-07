import java.util.*;
public class HeapSort {
    // Static array
    static int[] arr = {20, 5, 15, 22, 7, 2, 30,95,97,25,45};
    static int n = arr.length;

    public static void main(String[] args) {
        heapSort();

        // Print sorted array
        System.out.println("Sorted array:"+Arrays.toString(arr));
    }

    // Function to perform heap sort
    static void heapSort() {
        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on reduced heap
            heapify(i, 0);
        }
    }

    // Heapify a subtree rooted at index i
    static void heapify(int size, int i) {
        int largest = i;        // Initialize largest as root
        int left = 2 * i + 1;   // Left child
        int right = 2 * i + 2;  // Right child

        // If left child is larger than root
        if (left < size && arr[left] > arr[largest])
            largest = left;

        // If right child is larger than largest so far
        if (right < size && arr[right] > arr[largest])
            largest = right;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(size, largest);
        }
    }
}
