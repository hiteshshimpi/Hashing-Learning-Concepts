package Hashing;

import java.util.HashMap;

//Two sum
public class HashingSession122 {
    public static void main(String[] args) {
        int arr[] ={2,3,3};
        int target = 6;
        twoSum(arr,target);
    }
    public static void twoSum(int[] arr, int target){
        HashMap<Integer,Integer> hash = new HashMap<>();
        for (int i=0;i<arr.length;i++)
        {
            int expectedKey = target -arr[i];
            if(hash.containsKey(expectedKey))
            {
                System.out.println(hash.get(expectedKey)+" "+i);
            }
            hash.put(arr[i],i);
        }

    }
}
