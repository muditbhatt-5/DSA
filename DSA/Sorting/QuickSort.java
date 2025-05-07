import java.util.*;
public class QuickSort {
    

    // QUICK_SORT function as per algorithm
    static void QUICK_SORT(int[] K, int LB, int UB) {
        if (LB < UB) {
            int I = LB + 1;
            int J = UB;
            int KEY = K[LB];
            boolean FLAG = true;

            while (FLAG) {
                while (K[I] < KEY) I++;
                while (K[J] > KEY) J--;

                if (I < J) {
                    int temp = K[I];
                    K[I] = K[J];
                    K[J] = temp;
                } else {
                    FLAG = false;
                }
            }

            // Swap KEY with K[J]
            int temp = K[LB];
            K[LB] = K[J];
            K[J] = temp;

            // Recursive calls
            QUICK_SORT(K, LB, J - 1);
            QUICK_SORT(K, J + 1, UB);
        }
    }
    public static void main(String[] args) {
        // Static array (no input)
        int[] K = {40,80,20,0,10,30,1,2,3,4,5,6,7,8,100};

        System.out.println("Original Array:"+Arrays.toString(K));

        // Call Quick Sort
        QUICK_SORT(K, 0, K.length - 1);

        System.out.println("Sorted Array:"+Arrays.toString(K));
    }
}
