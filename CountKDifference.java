package Hashing;

import java.util.HashMap;
//Count Number of Pairs With Absolute Difference K
public class CountKDifference {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        int k = 1;
        int count = 0;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i] + k)) {
                count = count + hash.get(nums[i] + k);
            }
            if (hash.containsKey(nums[i] - k)) {
                count = count + hash.get(nums[i] - k);
            }
            hash.put(nums[i], hash.getOrDefault(nums[i],0) +1);
        }
        System.out.println(count);
    }
}