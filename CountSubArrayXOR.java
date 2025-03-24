package Hashing;

import java.util.HashMap;

public class CountSubArrayXOR {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;
        int res = 0;

        // Create map that stores number of prefix arrays
        // corresponding to a XOR value
        HashMap<Integer, Integer> mp = new HashMap<>();

        int prefXOR = 0;

        for (int val : arr) {

            // Find XOR of current prefix
            prefXOR ^= val;

            // If prefXOR ^ k exists in mp then there is a subarray
            // ending at i with XOR equal to k
            res += mp.getOrDefault(prefXOR ^ k, 0);

            // If this prefix subarray has XOR equal to k
            if (prefXOR == k)
                res++;

            // Add the XOR of this subarray to the map
            mp.put(prefXOR, mp.getOrDefault(prefXOR, 0) + 1);

        }
        System.out.println(res);;
    }
}
