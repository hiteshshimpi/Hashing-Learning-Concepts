package Hashing;
//Problem : You are given an integer array of size n and you have to process Q queris.
// Each query will contain an element x and we have to output the freq of x in an array

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class HashingSession12 {
    public static void main(String[] args) {
        Integer arr [] ={8,3,5,2,3,1,6,5,7,4,3,1,4};
        int [] queries ={3,1,7,4,5};
       // findFrequency(arr,queries);
        findFrequencyStreams(arr,queries);
    }

    public static void findFrequency(int[] arr, int[] queries)
    {
        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int i=0;i<arr.length;i++){
           if(!hash.containsKey(arr[i]))
           {
               hash.put(arr[i],1);
           }
           else
           {
               hash.put(arr[i],hash.get(arr[i])+1);
           }
        }

        // Now iterate over the Queries and find if it is present in hashmap
        for(int i =0;i<queries.length;i++)
        {
            if(hash.containsKey(queries[i])){
                System.out.println("Frequency for "+ queries[i]+" is "+hash.get(queries[i]));
            }
            else
            {
                System.out.println("0");
            }
        }
    }


    /// Using streams
    public  static void findFrequencyStreams(Integer [] arr, int [] queries)
    {
        List<Integer> list = Arrays.asList(arr);
        for(int i=0;i<queries.length;i++)
        {
            int digit = queries[i];
            List<Integer> par =list.stream().filter(x -> x == digit).collect(Collectors.toList());
            int count = par.size();
            System.out.println("Frequency is : "+count);
        }

    }


}
