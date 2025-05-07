import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        // Static array and pivot
        int[] arr = {10, 5, 30, 15, 25, 1, 20};
        int pivot = 15;

        System.out.println("Original Array:"+Arrays.toString(arr));

        // Call merge sort
        mergeSort(arr, 0, arr.length - 1, pivot);

        System.out.println("Sorted Array (around pivot " + pivot + "):"+Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int low, int high, int pivot) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid, pivot);
            mergeSort(arr, mid + 1, high, pivot);
            merge(arr, low, mid, high, pivot);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high, int pivot) {
        int i = low;
        int j = mid + 1;
        int k = 0;
        int[] temp = new int[high - low + 1];

        while (i <= mid && j <= high) {
            if (arr[i] < pivot && arr[j] < pivot) {
                temp[k++] = arr[i++];
            } else if (arr[i] >= pivot && arr[j] < pivot) {
                temp[k++] = arr[j++];
            } else if (arr[i] < pivot && arr[j] >= pivot) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= high) {
            temp[k++] = arr[j++];
        }

        // Copy temp[] to original array
        for (int m = 0; m < temp.length; m++) {
            arr[low + m] = temp[m];
        }
    }
}
