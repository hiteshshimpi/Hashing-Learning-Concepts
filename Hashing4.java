package Hashing;

import java.util.HashMap;

public class Hashing4 {
    //This is using the Hashmap Data structure
    // SP -- O(N)
    //TC -- O(1)

    public static void main(String[] args) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int[] arr = {1,3,3,4,1,4,4,4,4};
        int[] query = {3,4,1};


        for(int i=0;i<arr.length;i++)
        {
            if(!hash.containsKey(arr[i]))
            {
                hash.put(arr[i],1);
            }
            else
            {
                hash.put(arr[i],hash.get(arr[i])+1);
            }
        }


        for(int j =0;j<query.length;j++)
        {
            System.out.println("Frequency of  "+query[j] +" is : " +hash.get(query[j]));
        }
    }
}
