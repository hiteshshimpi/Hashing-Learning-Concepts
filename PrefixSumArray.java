package Hashing;

import com.sun.jdi.ArrayReference;

import java.util.Arrays;

public class PrefixSumArray {

    //LeetCode 303 -- Range sum immutable
   // find the sum of range [l to r] where (l<r) using prefix sum
    public static void main(String[] args) {
        int [] arr = {-2,0,3,-5,2,-1};
         prefixSum(arr,1,5);
        //System.out.println(sum);
    }

    public static void prefixSum(int[] arr, int l, int r)
    {
        int [] pre_sum = new int[arr.length];
        pre_sum[0]=arr[0];
        for(int i =1;i<arr.length;i++)
        {
            arr[i] = arr[i]+arr[i-1];
        }
        System.out.println(Arrays.toString(arr));


        if(l==0)
        {
            System.out.println("Sum is right : "+r);
        }
        else
        {
            int sum = arr[r]-arr[l-1];
            System.out.println(sum);
        }

    }

}
