package Hashing;


//Minimum operations to make all elements equal in an array



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashing7 {
    public static void main(String[] args) {
        int []arr1 = {1, 2, 1, 4, 3, 1};
        int max =0;

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

        Iterator<Map.Entry<Integer, Integer>> itr = hash.entrySet().iterator();
        while (itr.hasNext())
        {
            Map.Entry<Integer, Integer> entry = itr.next();
            if(entry.getValue()>max)
            {
                max = entry.getValue();
            }
        }

        System.out.println(arr1.length-max);
    }
}
