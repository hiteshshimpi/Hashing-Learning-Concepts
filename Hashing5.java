package Hashing;


//PART 4 (Check if the given array is subset of another array.) :
//
//Problem: Check if following given array is subset of another array.

import java.util.HashMap;

public class Hashing5 {
    public static void main(String[] args) {
      int[]  arr1 = {2,4,7,1,5};

        int [] arr2 = {4,1,5};
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<arr1.length;i++)
        {
            if(!hash.containsKey(arr1[i]))
            {
                hash.put(arr1[i],1);
            }
            else
            {
                hash.put(arr1[i],hash.get(arr1[i])+1);
            }
        }

        for(int j =0;j<arr2.length;j++) {
            int val = arr2[j];
            if (!hash.containsKey(arr2[j])) {
                System.out.println("It is not an subset of arr1");
                return;
            }
        }
        System.out.println("It is a subset");
    }
}
