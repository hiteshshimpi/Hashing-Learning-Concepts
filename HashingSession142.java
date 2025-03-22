package Hashing;

import java.util.HashMap;

//Longest Subarray with 0 Sum
public class HashingSession142 {
    public static void main(String[] args) {
        int[] arr={15, -2, 2, -8, 1, 7, 10, 23};
        int longest_Sum =0;
        int sum=0;
        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            sum = sum+ arr[i];
            if(sum ==0)
            {
                longest_Sum =i+1;
            }
            if(!hash.containsKey(sum))
            {
                hash.put(sum,i);
            }
            else
            {
                longest_Sum = Math.max(longest_Sum,i-hash.get(sum));
            }
        }
        System.out.println(longest_Sum);
    }
}
