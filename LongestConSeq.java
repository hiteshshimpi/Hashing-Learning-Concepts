package Hashing;

import java.util.HashMap;
import java.util.Map;
//https://github.com/hiteshshimpi/Hashing-Learning-Concepts.git
//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
public class LongestConSeq {
    public static void main(String[] args) {
        int[] arr={100,4,200,1,3,2};
        int maxCon=0;
        int conCount=0;

        HashMap<Integer,Boolean> present = new HashMap<>();
        HashMap<Integer,Boolean> checked = new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            present.put(arr[i],true);
        }
        System.out.println(present);

        for(int i=0;i<arr.length;i++)
        {
            if(present.containsKey(arr[i]-1))
            {
                checked.put(arr[i],true);
                int val =arr[i];
                while (present.containsKey(val))
                {
                    val++;
                    conCount++;
                }
                maxCon =Math.max(maxCon,conCount);
            }
            System.out.println(maxCon);
        }
    }
}
