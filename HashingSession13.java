package Hashing;


import java.util.HashMap;

//Given an array with repeated element the task is to find the max difference between 2 occurance of element.
public class HashingSession13 {
    public static void main(String[] args) {
        int[] arr = {3,2,1,2,1,4,5,8,6,7,4,2};
        HashMap<Integer,Integer> hash = new HashMap<>();
        int max=0;
        for (int i=0;i<arr.length;i++)
        {
            if(!hash.containsKey(arr[i]))
            {
                hash.put(arr[i],i);
            }
            else
            {
                int val = hash.get(arr[i]);
                if(i-val>max)
                {
                    max =i-val;
                }
            }

        }
        System.out.println(max);
    }
}
