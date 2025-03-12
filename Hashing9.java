package Hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashing9 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int[] arr = {3, 2, 3, 2, 4, 3};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (!hash.containsKey(arr[i])) {
                hash.put(arr[i], 1);
            }
            else
            {
                hash.put(arr[i], hash.get(arr[i]) + 1);

            }
        }
        System.out.println(hash);

        Iterator<Map.Entry<Integer,Integer>> itr = hash.entrySet().iterator();
            while (itr.hasNext())
            {
                Map.Entry<Integer,Integer> entry = itr.next();
                if(entry.getValue()>max)
                {
                    max = entry.getValue();
                }
                else if(entry.getValue()<min)
                {
                    min = entry.getValue();
                }
            }
        System.out.println("Max is  : " + max + " Min is :" + min);
    }
}
