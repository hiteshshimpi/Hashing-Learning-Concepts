package Hashing;


// Problem :  count all (i,j) pairs such tthat b[i]+b[j] == k count such pairs

import java.util.HashMap;

public class Hashingsession2 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 5;
        //int count =bruteForceSol1(arr,k);
        //System.out.println(count);
        hashMapSolution(arr,k);

    }

    public static  int bruteForceSol1(int [] arr,int k)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length-1;j++)
            {
                    if(arr[i]+arr[j]==k)
                    {
                        count++;
                    }
            }
        }
        return count;
    }

    public static void hashMapSolution(int [] arr, int k)
    {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int count =0;
        for(int i=0;i<arr.length;i++) {
            int sum = Math.abs(arr[i]-k);
            if(hash.containsKey(sum))
            {
                count++;
            }
            else {
                hash.put(arr[i],1);
            }
        }
        System.out.println(count);
    }

}
