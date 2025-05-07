import java.util.*;

public class ModhheQuick {

    static void qq(int[] K, int LB,int UB)
    {
        if(LB<UB)
        {
            int i = LB + 1;
            int j = UB;
            int KEY = K[LB];
            boolean FLAG = true;

            while(FLAG)
            {
                while(K[i]<KEY) i++;
                while(K[j]>KEY) j--;

                if(i<j)
                {
                    int temp = K[i];
                    K[i] = K[j];
                    K[j] = temp;
                }
                else
                {
                    FLAG = false;
                } 
                
            }
                int temp = K[LB];
                K[LB] = K[j];
                K[j] = temp;

                qq(K, LB, j - 1);
                qq(K, j + 1, UB);
        }
    }

    public static void main(String[] args)
    {
        int[] K = {40,80,20,0,10,30,95};
        System.out.println("Original Array:"+Arrays.toString(K));

        qq(K,0,K.length-1);
        System.out.println("Sorted Array:"+Arrays.toString(K));
    }
    
}