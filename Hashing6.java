package Hashing;


//Check if a given array is a subset of another array. Duplicate elements can be present.



import java.util.HashMap;

public class Hashing6 {
    public static void main(String[] args) {
        int []arr1 = {2,4,7,1,5,5};

        int []arr2 = {2,4,5,5,2};
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

        System.out.println(hash);
        for(int j =0;j<arr2.length;j++) {
            int val = arr2[j];
           if(!hash.containsKey(val)) {
               System.out.println("It is not a subset");
               return;
           }
           else
           {
               hash.put(val, hash.get(val) - 1);
           }

        }
        if(hash.containsValue(-1))
        {
            System.out.println("It is a not a subset");
        }
        else
        {
            System.out.println("It is a subset");
        }


    }
}
