package Hashing;


import java.util.Arrays;

//Find count of number of subarrays with sum ==  k
public class HashingSession6SumofSubarray {

    public static void main(String[] args) {
        int [] arr = {1,0,1,2,10,5};
        int k =3;
        int[] pre = new int[arr.length];
        pre[0]=arr[0];
        int count=0;
        System.out.println(Arrays.toString(arr));

        // getting the Prefix
        for(int i =1;i<arr.length;i++){
            pre[i]= arr[i]+pre[i-1];
        }
        System.out.println(Arrays.toString(pre));
        // Finding out the subarrays
        for(int j=1;j<arr.length;j++)
        {
           for(int i=0;i<arr.length;i++)
           {
               if(pre[i]==pre[j]-k)
               {
                    count++;
               }
           }
        }
        System.out.println(count);
    }



}
