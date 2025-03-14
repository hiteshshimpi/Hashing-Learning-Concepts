package Hashing;


// Count all i,j pairs where i<j and abs(b[i]-b[j]) = k [k>=0]

import java.util.HashMap;

public class Hashingsession4 {
    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 4, 2};
        int k = 2;
        int count =bruteForceSol1(arr,k);
        System.out.println(count);
        hashMapSolutionsess4(arr,k);

    }

    public static  int bruteForceSol1(int [] arr,int k)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                    if( Math.abs(arr[i]-arr[j])==k)
                    {
                        count++;
                    }
            }
        }
        return count;
    }

    public static void hashMapSolutionsess4(int [] arr, int k)
    {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int count =0;
        for(int i=0;i<arr.length;i++) {
            int sum = Math.abs(arr[i]+k);
            if(hash.containsKey(sum))
            {
                count++;
            }
            else {
                hash.put(arr[i],1);
            }
        }
        System.out.println("Count By Hashmap is : "+count);
    }

}
