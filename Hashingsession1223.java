package Hashing;

import java.util.Arrays;

// Given an array of integer n , we have a queries for each query we have 2 in l and r , we have to o/p
// th sum of sub array from l to r
public class Hashingsession1223 {
    public static void main(String[] args) {
        int [] arr ={2,4,3,1,6,5,7,3,2};
        int[][] queries={
                {4,5},
                {3,5},
                {4,9}
        };
        sumOfIntegers(arr,queries);
    }

    public static  void sumOfIntegers(int[] arr, int [] [] queries)
    {
        int [] prefix = new int[arr.length+1];
        int sum =0;
        for(int i=1;i<=arr.length;i++)
        {
            prefix[i] = prefix[i-1]+arr[i-1];
        }
        System.out.println(Arrays.toString(prefix));
       for(int[] query:queries)
       {
           int l = query[0];
           l=l-1;
           int r =query[1];
            sum =prefix[r]-prefix[l];
           System.out.println(sum);
       }
    }
}
