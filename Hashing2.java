package Hashing;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Hashing2 {
    // sovling the same hasing problem using as hash array
    // TimeCom =--O(N) + O(Q)
    //Space =--Can be very big if elements in the array are big like 10^6 in that case we need to make hash array as 10^6

    public static void main(String[] args) {

        int[] arr = {6, 2, 6, 5, 5, 6};
        int[] query = {6, 5, 2};
        int[] hash = new int[arr.length + 1];
        System.out.println(Arrays.toString(hash));

        for(int i =0;i<arr.length;i++)
        {
            int val = arr[i];
            hash[val] = hash[val]+1; // this will replace the value of element present at that index
        }
        System.out.println(Arrays.toString(hash));

        for (int j =0;j<query.length;j++)
        {
            int val = query[j];
            System.out.println("Frequency for "+query[j] +" is : "+hash[val]);
        }
    }

}